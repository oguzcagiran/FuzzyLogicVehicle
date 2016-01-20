package com.softcomputing.fuzzysystemgui;

import com.softcomputing.fuzzysystem.SpeedMembership;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class SpeedInputMembershipGraph extends AbstractMembershipGraph {
    
    private String inputRule;
    
    public SpeedInputMembershipGraph(String rule) {
        super("Membership","Graph", "Speed Input","Membership");
        this.inputRule = rule;
    }
    
    @Override
    public XYSeriesCollection createDataset() {
      
        XYSeriesCollection dataset = new XYSeriesCollection();
        
        XYSeries speedData = new XYSeries(inputRule);
        
        SpeedMembership speedMembership = new SpeedMembership();
        
        double result;
        
        for (int i = 0; i <= 200; i++) {
            
            if(inputRule.equals("Very Slow")) {
                result = speedMembership.getVerySlowMembership(i);
            } else if(inputRule.equals("Slow")) {
                result = speedMembership.getSlowMembership(i);
            } else if(inputRule.equals("Medium")) {
                result = speedMembership.getMediumMembership(i);
            } else if(inputRule.equals("Fast")) {
                result = speedMembership.getFastMembership(i);
            } else {
                result = speedMembership.getVeryFastMembership(i);
            }
            
            speedData.add(i, result);
                
        }
        
        dataset.addSeries(speedData);
        
        return dataset;
    }

}