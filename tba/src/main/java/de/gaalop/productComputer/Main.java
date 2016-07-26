package de.gaalop.productComputer;

import de.gaalop.algebra.AlStrategy;
import de.gaalop.cfg.AlgebraDefinitionFile;
import de.gaalop.tba.IMultTable;
import de.gaalop.tba.MultTableAbsDirectComputer;
import de.gaalop.tba.MultTableImpl;
import de.gaalop.tba.table.TableFormat;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Creates the multiplication table
 * @author Christian Steinmetz
 */
public class Main {

    public static void main(String[] args) throws IOException {
        int[] dimensions = {8};
        for (int dimension: dimensions) {
            ProductComputer productComputer = new ProductComputer();
            InputStream inputStream = AlStrategy.class.getResourceAsStream("algebra/"+dimension+"d/definition.csv");
            AlgebraDefinitionFile alFile = new AlgebraDefinitionFile();
            alFile.loadFromFile(inputStream);
            AlgebraPC algebraPC = new AlgebraPC(alFile);
            productComputer.initialize(algebraPC);


            //precalculate tables because of double use in TableCompressed
            int bladeCount = (int) Math.pow(2, algebraPC.base.length);

            MultTableImpl inner = new MultTableImpl();
            inner.createTable(bladeCount);
            MultTableImpl outer = new MultTableImpl();
            outer.createTable(bladeCount);
            MultTableImpl geo = new MultTableImpl();
            geo.createTable(bladeCount);

            IMultTable innerLive = new MultTableAbsDirectComputer(alFile, new InnerProductCalculator());
            IMultTable outerLive = new MultTableAbsDirectComputer(alFile, new OuterProductCalculator());
            IMultTable geoLive = new MultTableAbsDirectComputer(alFile, new GeoProductCalculator());
            
            for (int i=0;i<bladeCount;i++)
                for (int j=0;j<bladeCount;j++) {
                    inner.setProduct(i, j, innerLive.getProduct(i, j));
                    outer.setProduct(i, j, outerLive.getProduct(i, j));
                    geo.setProduct(i, j, geoLive.getProduct(i, j));
                }
            
            TableFormat.writeToFile(bladeCount,algebraPC.base.length,inner,outer,geo,new FileOutputStream("products"+dimension+".csv"),TableFormat.TABLE_COMPRESSED_MAX);
        }

    }

}
