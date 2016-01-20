package com.softcomputing.fuzzysystem;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author oguz
 */
public class Defuzzificator {

    public double defuzzify(String[][] rules, int speed, int distance) {
        
        Map<String,Double> ruleOutputMap = new HashMap<>();
        
        String firstSpeedRule = rules[0][0];
        String firstDistanceRule = rules[0][1];
        String firstMotorSpeedChangeRule = rules[0][2];
        
        String secondSpeedRule = rules[1][0];
        String secondDistanceRule = rules[1][1];
        String secondMotorSpeedChangeRule = rules[1][2];

        String thirdSpeedRule = rules[2][0];
        String thirdDistanceRule = rules[2][1];
        String thirdMotorSpeedChangeRule = rules[2][2];

        String fourthSpeedRule = rules[3][0];
        String fourthDistanceRule = rules[3][1];
        String fourthMotorSpeedChangeRule = rules[3][2];

        double firstRuleSpeedMembership = getSpeedMembership(firstSpeedRule, speed);
        double firstRuleDistanceMembership = getDistanceMembership(firstDistanceRule, distance);
        
        double secondRuleSpeedMembership = getSpeedMembership(secondSpeedRule, speed);
        double secondRuleDistanceMembership = getDistanceMembership(secondDistanceRule, distance);
        
        double thirdRuleSpeedMembership = getSpeedMembership(thirdSpeedRule, speed);
        double thirdRuleDistanceMembership = getDistanceMembership(thirdDistanceRule, distance);
        
        double fourthRuleSpeedMembership = getSpeedMembership(fourthSpeedRule, speed);
        double fourthRuleDistanceMembership = getDistanceMembership(fourthDistanceRule, distance);
        
        double firstRuleOutput = Math.min(firstRuleSpeedMembership, firstRuleDistanceMembership);
        double secondRuleOutput = Math.min(secondRuleSpeedMembership, secondRuleDistanceMembership);
        double thirdRuleOutput = Math.min(thirdRuleSpeedMembership, thirdRuleDistanceMembership);
        double fourthRuleOutput = Math.min(fourthRuleSpeedMembership, fourthRuleDistanceMembership);
        
        ruleOutputMap.put(firstMotorSpeedChangeRule, firstRuleOutput);
        ruleOutputMap.put(secondMotorSpeedChangeRule, secondRuleOutput);
        ruleOutputMap.put(thirdMotorSpeedChangeRule, thirdRuleOutput);
        ruleOutputMap.put(fourthMotorSpeedChangeRule, fourthRuleOutput);
        
        return calculateWithAverageMethod(ruleOutputMap);
        
    }

    private double calculateWithAverageMethod(Map<String, Double> ruleOutputMap) {
        
        double sumOfAllCrispInput = 0;
        double sumOfAllMembership = 0;
        
        /*
        0 stop
        1 stop
        2 stop
        3 slow down
        4 slow down
        5 slow down
        6 keep pace
        7 keep pace
        8 speed Up
        9 speed Up
        10 speed Up
        */

        for (int i = 0; i <= 10; i++) {
            if(i >= 0 && i <= 2) {
             
                double stopRes = ruleOutputMap.get("Stop");
                sumOfAllCrispInput += i * stopRes;
                sumOfAllMembership += stopRes;
                
            } else if(i >= 3 && i <= 5) {
                
                double slowDownRes = ruleOutputMap.get("Slow Down");
                sumOfAllCrispInput += i * slowDownRes;
                sumOfAllMembership += slowDownRes;
                
            } else if(i == 6 || i == 7) {
                
                double keepPaceRes = ruleOutputMap.get("Keep Pace");
                sumOfAllCrispInput += i * keepPaceRes;
                sumOfAllMembership += keepPaceRes;
                
            } else {
                
                double speedUpRes = ruleOutputMap.get("Speed Up");
                sumOfAllCrispInput += i * speedUpRes;
                sumOfAllMembership += speedUpRes;
                
            }
        }
        
        /**
         * If both 0 result is undefined
         */
        if(sumOfAllCrispInput == 0 && sumOfAllMembership == 0) {
            return 0;
        } else {
            return sumOfAllCrispInput / sumOfAllMembership;
        }
    }

    private double getSpeedMembership(String rule, int speed) {

        SpeedMembership speedMembership = new SpeedMembership();
        double membership = 0;

        if (rule.equals("Very Slow")) {
            membership = speedMembership.getVerySlowMembership(speed);
        } else if (rule.equals("Slow")) {
            membership = speedMembership.getSlowMembership(speed);
        } else if (rule.equals("Medium")) {
            membership = speedMembership.getMediumMembership(speed);
        } else if (rule.equals("Fast")) {
            membership = speedMembership.getFastMembership(speed);
        } else {
            membership = speedMembership.getVeryFastMembership(speed);
        }

        return membership;
    }

    private double getDistanceMembership(String rule, int distance) {
        
        DistanceMembership distanceMembership = new DistanceMembership();
        double membership = 0;

        if (rule.equals("Very Close")) {
            membership = distanceMembership.getVeryCloseMembership(distance);
        } else if (rule.equals("Close")) {
            membership = distanceMembership.getCloseMembership(distance);
        } else if (rule.equals("Normal")) {
            membership = distanceMembership.getNormalMembership(distance);
        } else {
            membership = distanceMembership.getAwayMembership(distance);
        }

        return membership;

    }
}