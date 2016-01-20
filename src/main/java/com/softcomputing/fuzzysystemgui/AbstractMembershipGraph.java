package com.softcomputing.fuzzysystemgui;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RefineryUtilities;
import javax.swing.JFrame;
import java.awt.Dimension;

/**
 *
 * @author oguz
 */
public abstract class AbstractMembershipGraph extends JFrame{
    
    private String applicationTitle;
    private String chartTitle;
    private String xAxisName;
    private String yAxisName;
    
    public AbstractMembershipGraph(String applicationTitle, String chartTitle, 
                                   String xAxisName, String yAxisName) {
        super(applicationTitle);
        this.applicationTitle = applicationTitle;
        this.chartTitle = chartTitle;
        this.xAxisName = xAxisName;
        this.yAxisName = yAxisName;   
    }
    
    public void showGraph() {
        
        JFreeChart lineChart = ChartFactory.createXYLineChart(
                                                        chartTitle,
                                                        xAxisName, yAxisName,
                                                        createDataset(),
                                                        PlotOrientation.VERTICAL,
                                                        true, true, false);
    
        ChartPanel chartPanel = new ChartPanel(lineChart);
        chartPanel.setPreferredSize(new Dimension(560, 367));
        setContentPane(chartPanel);
        this.pack();
        RefineryUtilities.centerFrameOnScreen(this);
        this.setVisible(true);
    }
    
    public abstract XYSeriesCollection createDataset();
    
}