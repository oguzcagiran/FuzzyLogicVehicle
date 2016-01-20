package com.softcomputing.fuzzysystem;

/**
 *
 * @author oguz
 */
public class MembershipTable {
    
    public static void main(String[] args) {
        
        SpeedMembership a = new SpeedMembership();
        DistanceMembership b = new DistanceMembership();
        MotorSpeedChangeMembership c = new MotorSpeedChangeMembership();
        
        System.out.println("Very Slow,     Slow,     Medium,     Fast,      Very Fast");
        for (int i = 0; i <= 200; i++) {
            System.out.print("i = "+ i + "       ");
            System.out.print(a.getVerySlowMembership(i) + "      ");
            System.out.print(a.getSlowMembership(i)  + "      ");
            System.out.print(a.getMediumMembership(i)  + "      ");
            System.out.print(a.getFastMembership(i)  + "      ");
            System.out.print(a.getVeryFastMembership(i)  + "      ");
            System.out.println("  ");
            
        }
        
        System.out.println("===============================================");
        
        System.out.println("Very Close,     Close,     Normal,     Away");
        for (int i = 1; i <= 100; i++) {
            System.out.print("i = "+ i + "       ");
            System.out.print(b.getVeryCloseMembership(i) + "      ");
            System.out.print(b.getCloseMembership(i)  + "      ");
            System.out.print(b.getNormalMembership(i)  + "      ");
            System.out.print(b.getAwayMembership(i)  + "      ");
            System.out.println("  ");
            
        }
        
        System.out.println("==================================================");
        
        System.out.println("Stop,     Slow Down,     Keep Pace,     Speed Up");
        for (int i = 0; i <= 10; i++) {
            System.out.print("i = "+ i + "       ");
            System.out.print(c.getStopMembership(i) + "      ");
            System.out.print(c.getSlowDownMembership(i)  + "      ");
            System.out.print(c.getKeepPaceMembership(i)  + "      ");
            System.out.print(c.getSpeedUpMembership(i)  + "      ");
            System.out.println("  ");
            
        }
        
    }
}