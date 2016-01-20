package com.softcomputing.fuzzysystemgui;

import com.softcomputing.fuzzysystem.SpeedMembership;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class SpeedMembershipGraph extends AbstractMembershipGraph {
    
    public SpeedMembershipGraph() {
        super("Membership","Graph", "Speed","Membership");
    }
    
    @Override
    public XYSeriesCollection createDataset() {
      
        XYSeriesCollection dataset = new XYSeriesCollection();
        
        XYSeries verySlowSerie = new XYSeries("Very Slow");
        XYSeries slowSerie = new XYSeries("Slow");
        XYSeries mediumSerie = new XYSeries("Medium");
        XYSeries fastSerie = new XYSeries("Fast");
        XYSeries veryFastSerie = new XYSeries("Very Fast");
        
        SpeedMembership speedMembership = new SpeedMembership();
        
        for (int i = 0; i <= 200; i++) {
            
            double resultForVerySlow = speedMembership.getVerySlowMembership(i);
            double resultForSlow = speedMembership.getSlowMembership(i);
            double resultForMedium = speedMembership.getMediumMembership(i);
            double resultForFast = speedMembership.getFastMembership(i);
            double resultForVeryFast = speedMembership.getVeryFastMembership(i);
            
            verySlowSerie.add(i,resultForVerySlow);
            slowSerie.add(i,resultForSlow);
            mediumSerie.add(i,resultForMedium);
            fastSerie.add(i,resultForFast);
            veryFastSerie.add(i,resultForVeryFast);
            
        }
        
        dataset.addSeries(veryFastSerie);
        dataset.addSeries(fastSerie);
        dataset.addSeries(mediumSerie);
        dataset.addSeries(slowSerie);
        dataset.addSeries(verySlowSerie);
        
        return dataset;
    }

}