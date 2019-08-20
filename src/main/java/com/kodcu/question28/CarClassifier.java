package com.kodcu.question28;


/**
 * 1 - Run CarClassifier.java
 * 2 - What does this program print?
 * 3 - Could you please fix it ?
 */
public class CarClassifier {

    public static String classify(Car car) {
        return "Car";
    }

    public static String classify(BMW bmw) {
        return "BMW";
    }

    public static String classify(Mercedes mercedes) {
        return "Mercedes";
    }

    public static void main(String[] args) {
        Car[] collections = {
                new Car(),
                new Mercedes(),
                new BMW()
        };

        for (Car car : collections)
            System.out.println(classify(car));
    }
}
