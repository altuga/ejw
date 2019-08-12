package com.kodcu.question21;

import java.math.RoundingMode;


/**
 *
 *
 */
public class Calculator {

    public static final double MERCURY_MASS = 3.302e+23;
    public static final double VENUS_MASS = 4.869e+24;
    public static final double EARTH_MASS = 5.975e+24;
    public static final double MARS_MASS = 6.419e+23;
    public static final double JUPITER_MASS = 1.899e+27;
    public static final double SATURN_MASS = 5.685e+26;
    public static final double URANUS_MASS = 8.683e+25;
    public static final double NEPTUNE_MASS = 1.024e+26;


    public static final double MERCURY_REDIUS = 2.439e6;
    public static final double VENUS_REDIUS  = 6.052e6;
    public static final double EARTH_REDIUS  = 6.378e6;
    public static final double MARS_REDIUS  = 3.393e6;
    public static final double JUPITER_REDIUS  = 7.149e7;
    public static final double SATURN_REDIUS  = 6.027e7;
    public static final double URANUS_REDIUS  = 2.556e7;
    public static final double NEPTUNE_REDIUS  = 2.477e7;

    private final double mass;           // In kilograms
    private final double radius;         // In meters
    private final double surfaceGravity; // In m / s^2

    // Universal gravitational constant in m^3 / kg s^2
    private static final double G = 6.67300E-11;

    // Constructor
    Calculator(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
        surfaceGravity = G * mass / (radius * radius);
    }

    public double mass()           { return mass; }
    public double radius()         { return radius; }
    public double surfaceGravity() { return surfaceGravity; }

    public double surfaceWeight(double mass) {
        return mass * surfaceGravity;  // F = ma
    }

}
