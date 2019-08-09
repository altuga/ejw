package com.kodcu.question19;

import java.util.HashSet;
import java.util.Set;


/*
TODO
 1 - ....
 2 - ....
 3 - ....
*/
public class Union {

    public static Set union(Set s1, Set s2) {
        Set result = new HashSet(s1);
        result.addAll(s2);
        return result;
    }

    // Simple program to exercise generic method
    public static void main(String[] args) {
        Set<String> guys = Set.of("Tom", "Dick", "Harry");
        Set<Integer> ages = Set.of(44, 34, 21);
        Set<String> aflCio = union(guys, ages);
        System.out.println(aflCio);
    }
}