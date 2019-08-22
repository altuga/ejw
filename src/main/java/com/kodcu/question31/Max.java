package com.kodcu.question31;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;


public class Max {


    // Returns maximum value in collection - throws exception if empty
    public static String max(Collection<String> collection) {
        if (collection.isEmpty())
            throw new IllegalArgumentException("Empty collection");

        String result = null;
        for (String e : collection) {
            if (result == null || result.compareTo(e) > 0)
                result = Objects.requireNonNull(e);
        }


        return result;
    }



    public static void main(String[] args) {
        List<String> words = Arrays.asList("100", "20", "5");

        System.out.println(max(words));


    }
}
