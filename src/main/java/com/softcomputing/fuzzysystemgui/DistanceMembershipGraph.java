package com.softcomputing.fuzzysystemgui;

import com.softcomputing.fuzzysystem.DistanceMembership;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author oguz
 */
public class DistanceMembershipGraph extends AbstractMembershipGraph {
    
    public DistanceMembershipGraph() {
        super("Membership","Graph", "Distance","Membership");
    }

    @Override
    public XYSeriesCollection createDataset() {
        
        XYSeriesCollection dataset = new XYSeriesCollection();
        
        XYSeries veryCloseSerie = new XYSeries("Very Close");
        XYSeries closeSerie = new XYSeries("Close");
        XYSeries normalSerie = new XYSeries("Normal");
        XYSeries awaySerie = new XYSeries("Away");
        
        DistanceMembership distanceMembership = new DistanceMembership();
        
        for (int i = 1; i <= 100 ; i++) {
            
            double resultForVeryClose =distanceMembership.getVeryCloseMembership(i);
            double resultForClose = distanceMembership.getCloseMembership(i);
            double resultForNormal = distanceMembership.getNormalMembership(i);
            double resultForAway = distanceMembership.getAwayMembership(i);
            
            veryCloseSerie.add(i, resultForVeryClose);
            closeSerie.add(i, resultForClose);
            normalSerie.add(i, resultForNormal);
            awaySerie.add(i, resultForAway);
        }
        
        dataset.addSeries(veryCloseSerie);
        dataset.addSeries(closeSerie);
        dataset.addSeries(normalSerie);
        dataset.addSeries(awaySerie);
        
        return dataset;
    }
}