package com.softcomputing.fuzzysystemgui;

import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author oguz
 */
public class KeepPaceImplicationGraph extends AbstractMembershipGraph {
    
    private double result;
    
    public KeepPaceImplicationGraph(double result) {
        super("Membership","Graph", "Keep Pace Implication","Membership");
        this.result = result;
    }

    @Override
    public XYSeriesCollection createDataset() {

        XYSeriesCollection dataset = new XYSeriesCollection();
        
        XYSeries keepPaceData = new XYSeries("Keep Pace Implication");
        
        double newLeftXValue =  result*(6-5)+5;
        double newRightXValue = result*(8-6)-8;
        
        keepPaceData.add(5, 0);
        keepPaceData.add(newLeftXValue,result);
        keepPaceData.add(newRightXValue * -1, result);
        keepPaceData.add(8, 0);
        
        dataset.addSeries(keepPaceData);
        
        return dataset;
    }

}