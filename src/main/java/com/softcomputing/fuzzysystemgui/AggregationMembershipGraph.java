package com.softcomputing.fuzzysystemgui;

import java.util.Map;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author oguz
 */
public class AggregationMembershipGraph extends AbstractMembershipGraph {

    private Map<String, Double> resultMap;
    
    public AggregationMembershipGraph(Map<String, Double> resultMap) {
        super("Membership","Graph", "Aggregation","Membership");
        this.resultMap = resultMap;
    }

    @Override
    public XYSeriesCollection createDataset() {

        XYSeriesCollection dataset = new XYSeriesCollection();

        XYSeries slowDownData = new XYSeries("Slow Down");
        XYSeries stopData = new XYSeries("Stop");
        XYSeries keepPaceData = new XYSeries("Keep Pace");
        XYSeries speedUpData = new XYSeries("Speed Up");
                
        double resForStop = resultMap.get("Stop");
        double resForSlowDown = resultMap.get("Slow Down");
        double resForKeepPace = resultMap.get("Keep Pace");
        double resForSpeedUp = resultMap.get("Speed Up");

        double newStopXValue = resForStop * (4 - 0) - 4;

        double newSlowDownLeftXValue = resForSlowDown * (4 - 2) + 2;
        double newSlowDownRightXValue = (6 - 4) * resForSlowDown - 6;

        double newKeepPaceLeftXValue = resForKeepPace * (6 - 5) + 5;
        double newKeepPaceRightXValue = resForKeepPace * (8 - 6) - 8;

        double newSpeedUpXValue = resForSpeedUp * (10 - 7) + 7;

        stopData.add(4,0);
        stopData.add(newStopXValue * -1, resForStop);
                
        slowDownData.add(2,0);
        slowDownData.add(newSlowDownLeftXValue, resForSlowDown);
        slowDownData.add(newSlowDownRightXValue * -1, resForSlowDown);
        slowDownData.add(6,0);
        
        keepPaceData.add(5,0);
        keepPaceData.add(newKeepPaceLeftXValue, resForKeepPace);
        keepPaceData.add(newKeepPaceRightXValue * -1, resForKeepPace);
        keepPaceData.add(8,0);
        
        speedUpData.add(7,0);
        speedUpData.add(newSpeedUpXValue, resForSpeedUp);

        dataset.addSeries(stopData);
        dataset.addSeries(slowDownData);
        dataset.addSeries(keepPaceData);
        dataset.addSeries(speedUpData);
        
        return dataset;
    }
}