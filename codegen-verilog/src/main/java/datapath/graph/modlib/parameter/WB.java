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
public class WB extends Parameter<Integer> {

    public WB(Integer value) {
        super(value);
    }

    @Override
    public String getName() {
        return "WB";
    }
}
