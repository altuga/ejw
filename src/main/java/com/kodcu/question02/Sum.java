package com.kodcu.question02;


/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 * 
 * Email : altug@kodcu.com
 * Twitter : @altugaltintas
 */

/*
TODO 
 1 - Run the appliction
 2 - Discussion : Did you feel any abnormality about the performance ?
 3 - Instructor will show the solutions
 4 - Refactor and ask questions 
*/
public class Sum {
    private static long sum() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {

        long start = System.nanoTime(); // always use nanotTime for accuracy
        sum();
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000. + " ms..");



    }
}