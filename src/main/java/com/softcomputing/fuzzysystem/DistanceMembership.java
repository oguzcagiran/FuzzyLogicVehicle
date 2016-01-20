package com.softcomputing.fuzzysystem;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author oguz
 */
public class DistanceMembership extends AbstractMembership {
    
    private static final int A_FOR_VERY_CLOSE = 0;
    private static final int B_FOR_VERY_CLOSE = 1;
    private static final int C_FOR_VERY_CLOSE = 30;
    
    private static final int A_FOR_CLOSE = 20;
    private static final int B_FOR_CLOSE = 30;
    private static final int C_FOR_CLOSE = 40;
    private static final int D_FOR_CLOSE = 60;
    
    private static final int A_FOR_NORMAL = 50;
    private static final int B_FOR_NORMAL = 65;
    private static final int C_FOR_NORMAL = 80;
    
    private static final int A_FOR_AWAY = 70;
    private static final int B_FOR_AWAY = 100;
    private static final int C_FOR_AWAY = 0;
    
    private Map<Integer, Double> veryCloseMap = new HashMap<>();
    private Map<Integer, Double> closeMap = new HashMap<>();
    private Map<Integer, Double> normalMap = new HashMap<>();
    private Map<Integer, Double> awayMap = new HashMap<>();
    
    public DistanceMembership() {
        
        for (int i = 1; i <= 100 ; i++) {
            
            double veryClose = calculateTriangularMembership(i, A_FOR_VERY_CLOSE,
                                                                B_FOR_VERY_CLOSE,
                                                                C_FOR_VERY_CLOSE);
            
            double close = calculateTrapezoidMembership(i, A_FOR_CLOSE,
                                                           B_FOR_CLOSE,
                                                           C_FOR_CLOSE, 
                                                           D_FOR_CLOSE);
            
            double normal = calculateTriangularMembership(i, A_FOR_NORMAL,
                                                             B_FOR_NORMAL,
                                                             C_FOR_NORMAL);
            
            double away = calculateTriangularMembership(i, A_FOR_AWAY, 
                                                           B_FOR_AWAY,
                                                           C_FOR_AWAY);
            
            
            veryCloseMap.put(i, veryClose);
            closeMap.put(i, close);
            normalMap.put(i, normal);
            awayMap.put(i, away);
            
        } 
    
    }
        
    public double getVeryCloseMembership(int distance) {
        return veryCloseMap.get(distance);
    }
 
    public double getCloseMembership(int distance) {
        return closeMap.get(distance);
    }
    
    public double getNormalMembership(int distance) {
        return normalMap.get(distance);
    }
    
    public double getAwayMembership(int distance) {
        return awayMap.get(distance);
    }
       
}