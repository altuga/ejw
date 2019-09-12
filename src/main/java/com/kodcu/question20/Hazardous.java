package com.kodcu.question20;

import java.util.List;


/*
TODO
 1 - Compile Combiner.java
 2 - There are 1 warnings, can you spot the warning ?
 3 - try to fix this 1 warning.
*/
public class Hazardous {


    static void hazardous( List<String>... stringLists) { //1
        List<Integer> intList = List.of(42);
        Object[] objects = stringLists;
        objects[0] = intList; // Heap pollution
        String s = stringLists[0].get(0); // ClassCastException
    }

    public static void main(String[] args) {
        hazardous(List.of("There be dragons!"));
    }
}