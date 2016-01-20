package com.softcomputing.fuzzysystemgui;

import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author oguz
 */
public class StopImplicationGraph extends AbstractMembershipGraph {

    private double result;
        
    public StopImplicationGraph(double result) {
        super("Membership","Graph", "Stop Implication","Membership");
        this.result = result;
    }

    @Override
    public XYSeriesCollection createDataset() {

        XYSeriesCollection dataset = new XYSeriesCollection();
        
        XYSeries stopData = new XYSeries("Stop Implication");
        
        double newXValue = result*(4-0)-4;
        
        stopData.add(-1 * newXValue, result);
        stopData.add(4,0);
                
        dataset.addSeries(stopData);
       
        return dataset;
    }

}