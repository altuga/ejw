package com.kodcu.question05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import static java.util.Comparator.comparingInt;
import java.util.List;

/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 * 
 * Email : altug@kodcu.com
 * Twitter : @altugaltintas
 */

/*
TODO: 
 1 - Run the app like this ex: java Sort Istanbul Tokyo
 2 - Sort the words according to length() of the String
 3 - Instructor will show the solutions
 4 - Refactor and ask questions 
*/
public class Sort {

    // Sort according to lenght of the String
    public static void main(String[] args) {
        List<String> words = Arrays.asList(args);
        System.out.println(words);
        
        /*Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });*/
        
        // Collections.sort(words, (s1,s2) -> Integer.compare(s1.length(), s2.length()));
        
        // Collections.sort(words, comparingInt(String::length));
        
        words.sort(comparingInt(String::length));
        
         System.out.println(words);
    }
}
