/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package datapath.graph.modlib.parameter;

import datapath.graph.modlib.Parameter;

/**
 *
 * @author jh
 */
public class DATA_WIDTH extends Parameter<Integer> {

    @Override
    public String getName() {
        return "DATA_WIDTH";
    }

    public DATA_WIDTH(Integer value) {
        super(value);
    }

}
