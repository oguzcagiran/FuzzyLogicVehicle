package com.softcomputing.fuzzysystemgui;

import com.softcomputing.fuzzysystem.DistanceMembership;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author oguz
 */
public class DistanceInputMembershipGraph extends AbstractMembershipGraph {
    
    private String inputRule;
    
    public DistanceInputMembershipGraph(String rule) {
        super("Membership","Graph", "Distance Input","Membership");
        this.inputRule = rule;
    }

    @Override
    public XYSeriesCollection createDataset() {
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        
        XYSeries distanceData = new XYSeries(inputRule);
        
        DistanceMembership distanceMembership = new DistanceMembership();
        
        double result = 0;
        
        for (int i = 1; i <= 100; i++) {
            
            if(inputRule.equals("Very Close")) {
                result = distanceMembership.getVeryCloseMembership(i);
            } else if(inputRule.equals("Close")) {
                result = distanceMembership.getCloseMembership(i);
            } else if(inputRule.equals("Normal")) {
                result = distanceMembership.getNormalMembership(i);
            } else {
                result = distanceMembership.getAwayMembership(i);
            }
            
            distanceData.add(i, result);
                
        }
        
        dataset.addSeries(distanceData);
        
        return dataset;
    }
}