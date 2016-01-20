package com.softcomputing.fuzzysystemgui;

import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author oguz
 */
public class SlowDownImplicationGraph extends AbstractMembershipGraph {

    private double result;
   
    public SlowDownImplicationGraph(double result) {
        super("Membership","Graph", "Slow Down Implication","Membership");
        this.result = result;
    }

    @Override
    public XYSeriesCollection createDataset() {

        XYSeriesCollection dataset = new XYSeriesCollection();

        XYSeries slowDownData = new XYSeries("Slow Down Implication");
        
        double newLeftXValue = result * (4-2) + 2;
        double newRightXValue = (6-4)*result -6;
        
        slowDownData.add(2, 0);
        slowDownData.add(newLeftXValue, result);
        slowDownData.add(newRightXValue * -1, result);
        slowDownData.add(6,0);

        dataset.addSeries(slowDownData);
        
        return dataset;
    }
    
}