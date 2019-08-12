package com.kodcu.question21;


/**
 * TODO
 * 1 - How to calculate WeightTable in a for-loop - 5 minutes
 * 2 - Instructor will show the solutions
 * 3 - What is the lesson  ?
 */
public class Main {

    public static void main(String[] args) {
        double earthWeight = Double.parseDouble(args[0]);

        double result = Calculator.
                calculateSurfaceWeight(Calculator.MARS_REDIUS,
                        Calculator.MARS_MASS, earthWeight);
        System.out.printf("Weight on %s is %f%n", "Calculator.MARS_REDIUS", result);

        /**
         * for (Planets p  ...) {
         *   .......
         *    System.out.printf ...
         * }
         */
    }
}
