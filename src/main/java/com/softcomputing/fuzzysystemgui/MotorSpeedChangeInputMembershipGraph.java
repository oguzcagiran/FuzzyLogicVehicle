package com.softcomputing.fuzzysystemgui;

import com.softcomputing.fuzzysystem.MotorSpeedChangeMembership;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author oguz
 */
public class MotorSpeedChangeInputMembershipGraph extends AbstractMembershipGraph {
    
    private String inputRule;
    
    public MotorSpeedChangeInputMembershipGraph(String rule) {
        super("Membership","Graph", "Motor Speed Input","Membership");
        this.inputRule = rule;
    }
    
    @Override
    public XYSeriesCollection createDataset() {
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        
        XYSeries motorSpeedData = new XYSeries(inputRule);
        
        MotorSpeedChangeMembership motorSpeedChangeMembership = new MotorSpeedChangeMembership();
        
        double result = 0;
        
        for (int i = 0; i <= 10; i++) {
            
            if(inputRule.equals("Stop")) {
                result = motorSpeedChangeMembership.getStopMembership(i);
            } else if(inputRule.equals("Slow Down")) {
                result = motorSpeedChangeMembership.getSlowDownMembership(i);
            } else if(inputRule.equals("Keep Pace")) {
                result = motorSpeedChangeMembership.getKeepPaceMembership(i);
            } else if(inputRule.equals("Speed Up")) {
                result = motorSpeedChangeMembership.getSpeedUpMembership(i);
            }
            
            
            motorSpeedData.add(i, result);
                
        }
        
        dataset.addSeries(motorSpeedData);
        
        return dataset;
    }
}