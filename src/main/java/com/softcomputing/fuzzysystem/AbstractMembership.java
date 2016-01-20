package com.softcomputing.fuzzysystem;

/**
 *
 * @author oguz
 */
public abstract class AbstractMembership {

    public AbstractMembership() {
        
    }

    protected double calculateTriangularMembership(double x, double a, double b, double c) {
        return Math.max(Math.min((x - a) / (b - a), (c - x) / (c - b)), 0);
    }

    protected double calculateTrapezoidMembership(double x, double a, double b, double c, double d) {
        double min = Math.min((x - a) / (b - a), 1);
        
        return Math.max(Math.min(min, (d - x) / (d - c)), 0);
    }
    
}