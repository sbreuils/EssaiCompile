package de.gaalop.visualCodeInserter2d;

import de.gaalop.ConfigurationProperty;
import de.gaalop.ConfigurationProperty.Type;
import de.gaalop.Notifications;
import de.gaalop.VisualCodeInserterStrategy;
import de.gaalop.VisualCodeInserterStrategyPlugin;
import java.awt.Image;
import java.util.Observable;

/**
 * Sets the algebra on the Control Flow Graph
 * @author Christian Steinmetz
 */
public class Plugin extends Observable implements VisualCodeInserterStrategyPlugin {

    @Override
    public VisualCodeInserterStrategy createVisualCodeInserterStrategy() {
        return new VisualizerCodeInserter2d();
    }

    @Override
    public String getName() {
        return "Visual Code Inserter 2d";
    }

    @Override
    public String getDescription() {
        return "This plugin sets the 2d visualizing commands";
    }

    @Override
    public Image getIcon() {
        return null;
    }

    void notifyError(Throwable error) {
        setChanged();
        notifyObservers(new Notifications.Error(error));
    }

}
