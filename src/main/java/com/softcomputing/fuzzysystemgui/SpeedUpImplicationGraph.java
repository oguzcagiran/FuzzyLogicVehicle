package com.softcomputing.fuzzysystemgui;

import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author oguz
 */
public class SpeedUpImplicationGraph extends AbstractMembershipGraph {

    private double result;
    
    public SpeedUpImplicationGraph(double result) {
        super("Membership","Graph", "Speed Up Implication","Membership");
        this.result = result;
    }

    @Override
    public XYSeriesCollection createDataset() {

        XYSeriesCollection dataset = new XYSeriesCollection();
        
        XYSeries speedData = new XYSeries("Speed Up Implication");
        
        double newXValue = result * (10-7) + 7;
        
        speedData.add(7,0);
        speedData.add(newXValue,result);
       
        dataset.addSeries(speedData);
        
        return dataset;
    }
}