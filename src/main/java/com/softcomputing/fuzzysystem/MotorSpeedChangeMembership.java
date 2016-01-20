package com.softcomputing.fuzzysystem;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author oguz
 */
public class MotorSpeedChangeMembership extends AbstractMembership {
    
    private static final int A_FOR_STOP = 10;
    private static final int B_FOR_STOP = 0;
    private static final int C_FOR_STOP = 4;
    
    private static final int A_FOR_SLOW_DOWN = 2;
    private static final int B_FOR_SLOW_DOWN = 4;
    private static final int C_FOR_SLOW_DOWN = 6;
    
    private static final int A_FOR_KEEP_PACE = 5;
    private static final int B_FOR_KEEP_PACE = 6;
    private static final int C_FOR_KEEP_PACE = 8;
    
    private static final int A_FOR_SPEED_UP = 7;
    private static final int B_FOR_SPEED_UP = 10;
    private static final int C_FOR_SPEED_UP = 0;
    
    private Map<Integer, Double> stopMap = new HashMap<>();
    private Map<Integer, Double> slowDownMap = new HashMap<>();
    private Map<Integer, Double> keepPaceMap = new HashMap<>();
    private Map<Integer, Double> speedUpMap = new HashMap<>();

    public MotorSpeedChangeMembership() {
    
        for (int i = 0; i <= 10 ; i++) {
            
            double stop = calculateTriangularMembership(i, A_FOR_STOP, 
                                                           B_FOR_STOP, 
                                                           C_FOR_STOP);
            
            double slowDown = calculateTriangularMembership(i, A_FOR_SLOW_DOWN,
                                                               B_FOR_SLOW_DOWN,
                                                               C_FOR_SLOW_DOWN);
            
            double keepPace = calculateTriangularMembership(i, A_FOR_KEEP_PACE,
                                                               B_FOR_KEEP_PACE, 
                                                               C_FOR_KEEP_PACE);
            
            double speedUp = calculateTriangularMembership(i, A_FOR_SPEED_UP,
                                                              B_FOR_SPEED_UP,
                                                              C_FOR_SPEED_UP);
            stopMap.put(i, stop);
            slowDownMap.put(i, slowDown);
            keepPaceMap.put(i, keepPace);
            speedUpMap.put(i, speedUp);
        }
        
    }
    
    public double getStopMembership(int motorSpeed) {
        return stopMap.get(motorSpeed);
    }
    
    public double getSlowDownMembership(int motorSpeed) {
        return slowDownMap.get(motorSpeed);
    }
    
    public double getKeepPaceMembership(int motorSpeed) {
        return keepPaceMap.get(motorSpeed);
    }
    
    public double getSpeedUpMembership(int motorSpeed) {
        return speedUpMap.get(motorSpeed);
    }
    
}