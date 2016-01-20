package com.softcomputing.fuzzysystem;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author oguz
 */
public class SpeedMembership extends AbstractMembership {

    private static final int A_FOR_VERY_SLOW = -1;
    private static final int B_FOR_VERY_SLOW = 0;
    private static final int C_FOR_VERY_SLOW = 20;
    private static final int D_FOR_VERY_SLOW = 40;

    private static final int A_FOR_SLOW = 20;
    private static final int B_FOR_SLOW = 40;
    private static final int C_FOR_SLOW = 60;

    private static final int A_FOR_MEDIUM = 50;
    private static final int B_FOR_MEDIUM = 80;
    private static final int C_FOR_MEDIUM = 120;

    private static final int A_FOR_FAST = 100;
    private static final int B_FOR_FAST = 130;
    private static final int C_FOR_FAST = 160;

    private static final int A_FOR_VERY_FAST = 140;
    private static final int B_FOR_VERY_FAST = 180;
    private static final int C_FOR_VERY_FAST = 200;
    private static final int D_FOR_VERY_FAST = 201;

    private Map<Integer, Double> verySlowMap = new HashMap<>();
    private Map<Integer, Double> slowMap = new HashMap<>();
    private Map<Integer, Double> mediumMap = new HashMap<>();
    private Map<Integer, Double> fastMap = new HashMap<>();
    private Map<Integer, Double> veryFastMap = new HashMap<>();

    public SpeedMembership() {

        for (int i = 0; i <= 200; i++) {

            double verySlow = calculateTrapezoidMembership(i, A_FOR_VERY_SLOW,
                                                              B_FOR_VERY_SLOW,
                                                              C_FOR_VERY_SLOW,
                                                              D_FOR_VERY_SLOW);

            double slow = calculateTriangularMembership(i, A_FOR_SLOW,
                                                           B_FOR_SLOW,
                                                           C_FOR_SLOW);

            double medium = calculateTriangularMembership(i, A_FOR_MEDIUM,
                                                             B_FOR_MEDIUM,
                                                             C_FOR_MEDIUM);

            double fast = calculateTriangularMembership(i, A_FOR_FAST,
                                                           B_FOR_FAST,
                                                           C_FOR_FAST);

            double veryFast = calculateTrapezoidMembership(i, A_FOR_VERY_FAST,
                                                              B_FOR_VERY_FAST,
                                                              C_FOR_VERY_FAST,
                                                              D_FOR_VERY_FAST);

            verySlowMap.put(i, verySlow);
            slowMap.put(i, slow);
            mediumMap.put(i, medium);
            fastMap.put(i, fast);
            veryFastMap.put(i, veryFast);

        }
    }

    public double getVerySlowMembership(int speed) {
        return verySlowMap.get(speed);
    }
 
    public double getSlowMembership(int speed) {
        return slowMap.get(speed);
    }
    
    public double getMediumMembership(int speed) {
        return mediumMap.get(speed);
    }
    
    public double getFastMembership(int speed) {
        return fastMap.get(speed);
    }
    
    public double getVeryFastMembership(int speed) {
        return veryFastMap.get(speed);
    }
    
}