package de.gaalop.gui;

import de.gaalop.gui.util.PluginConfigurator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.*;

import com.sun.jna.Platform;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

/**
 * The main entry point for the Gaalop GUI.
 */
public class Main {

    private Log log = LogFactory.getLog(Main.class);
    private static final String CONFIG_FILENAME = "gaalop.xml";
    private static final String DEBUG_LOG = "debug.log";
    private static final String LOG_PATTERN = "%d{ISO8601} %-5p [%t] %c: %m%n";
	private MainForm mainForm;

    public static void main(String[] args) throws IOException {
        if (args.length > 0 && args[0].equals("-debug")) {
            startLog();
        }

        Main main = new Main();
        main.run();
    }

    private static void startLog() throws IOException {
        PatternLayout layout = new PatternLayout(LOG_PATTERN);
        FileAppender appender = new FileAppender(layout, DEBUG_LOG, false);
        BasicConfigurator.configure(appender);
        Logger rootLogger = Logger.getRootLogger();
        rootLogger.setLevel(Level.ALL);
    }

    public void run() {
        try {
          if (Platform.isWindows()) {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
          }
        } catch (Exception e) {
            e.printStackTrace();
        }

        mainForm = new MainForm();


        JFrame mainWindow = new JFrame("Gaalop");
        mainWindow.setIconImage(getIcon());
        mainWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainWindow.setContentPane(mainForm.getContentPane());
        mainWindow.pack();
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setVisible(true);
        
        loadConfig();
        mainForm.panelPluginSelection.refreshAlgebras();
        mainForm.loadOpenedFiles();

        // Save the config whenever the main window is closed
        mainWindow.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                saveConfig();
                mainForm.saveOpenedFiles();
            }
        });
    }

    private void loadConfig() {
        Properties config = new Properties();

        if (new File(CONFIG_FILENAME).exists()) {
            try {
                FileInputStream input = new FileInputStream(CONFIG_FILENAME);
                try {
                    config.loadFromXML(input);
                } finally {
                    input.close();
                }
            } catch (IOException e) {
                log.error("Unable to load configuration file " + CONFIG_FILENAME, e);
            }

            log.debug("Configuration loaded: " + config);
        }

        PluginConfigurator configurator = new PluginConfigurator(config);
        configurator.configureAll(mainForm.getStatusBar());
    }

    private void saveConfig() {
        PluginConfigurator configurator = new PluginConfigurator();
        configurator.readConfiguration();

        Properties config = configurator.getConfiguration();

        try {
            FileOutputStream out = new FileOutputStream(CONFIG_FILENAME);
            try {
                config.storeToXML(out, "Gaalop Configuration File");
            } finally {
                out.close();
            }
        } catch (IOException e) {
            log.error("Unable to save configuration file " + CONFIG_FILENAME, e);
        }
    }

    public Image getIcon() {
        URL iconUrl = getClass().getResource("icon.png");
        if (iconUrl == null) {
            log.warn("Couldn't find application icon.");
            return null;
        }

        try {
            return ImageIO.read(iconUrl);
        } catch (IOException e) {
            log.error("Unable to load application icon.", e);
            return null;
        }
    }
}
