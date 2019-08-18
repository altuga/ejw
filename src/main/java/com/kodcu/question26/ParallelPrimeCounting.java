package com.kodcu.question26;

import java.math.BigInteger;
import java.util.stream.LongStream;

/*
TODO

1 - Can you make thi app faster ?
2 - Measure the work time
*/
public class ParallelPrimeCounting {
    // Prime-counting stream pipeline - parallel version (Page 225)



    static long pi(long n) {

        long startTime = System.nanoTime();
        long count =  LongStream.rangeClosed(2, n)
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();

        long end = System.nanoTime();

        System.out.println( (end- startTime) / 1_000_000_000   );
        return count;

    }

    public static void main(String[] args) {
        System.out.println(pi(10_000_000));
    }
}
