package com.softcomputing.fuzzysystemgui;

import com.softcomputing.fuzzysystem.MotorSpeedChangeMembership;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author oguz
 */
public class MotorSpeedChangeMembershipGraph extends AbstractMembershipGraph {
    
    public MotorSpeedChangeMembershipGraph() {
        super("Membership","Graph", "Motor Speed Change","Membership");
    }
    
    @Override
    public XYSeriesCollection createDataset() {
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        
        XYSeries stopSerie = new XYSeries("Stop");
        XYSeries slowDownSerie = new XYSeries("Slow Down");
        XYSeries keepPaceSerie = new XYSeries("Keep Pace");
        XYSeries speedUpSerie = new XYSeries("Speed Up");
        
        MotorSpeedChangeMembership motorSpeedChangeMembership = new MotorSpeedChangeMembership();
        
        for (int i = 0; i <= 10 ; i++) {
            
            double resultForStop = motorSpeedChangeMembership.getStopMembership(i);
            double resultForSlowDown = motorSpeedChangeMembership.getSlowDownMembership(i);
            double resultForKeepPace = motorSpeedChangeMembership.getKeepPaceMembership(i);
            double resultForSpeedUp = motorSpeedChangeMembership.getSpeedUpMembership(i);
            
            stopSerie.add(i, resultForStop);
            slowDownSerie.add(i, resultForSlowDown);
            keepPaceSerie.add(i, resultForKeepPace);
            speedUpSerie.add(i, resultForSpeedUp);
            
        }
        
        dataset.addSeries(stopSerie);
        dataset.addSeries(slowDownSerie);
        dataset.addSeries(keepPaceSerie);
        dataset.addSeries(speedUpSerie);
        
        return dataset;
    }

}