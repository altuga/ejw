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

//    // Returns maximum value in collection as an Optional<E> (Page 250)
//    public static <E extends Comparable<E>>
//    Optional<E> max(Collection<E> c) {
//        if (c.isEmpty())
//            return Optional.empty();
//
//        E result = null;
//        for (E e : c)
//            if (result == null || e.compareTo(result) > 0)
//                result = Objects.requireNonNull(e);
//
//        return Optional.of(result);
//    }

    // Returns max val in collection as Optional<E> - uses stream (Page 250)
//    public static <E extends Comparable<E>>
//    Optional<E> max(Collection<E> c) {
//        return c.stream().max(Comparator.naturalOrder());
//    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("100", "20", "5");

        System.out.println(max(words));

        // Using an optional to provide a chosen default value (Page 251)
        //String lastWordInLexicon = max(words).orElse("No words...");
        //System.out.println(lastWordInLexicon);
    }
}
