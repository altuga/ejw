package com.kodcu.question26;

import java.math.BigInteger;
import java.util.stream.Stream;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.TWO;


/*
TODO

1 - Can you make thi app faster ?

*/
public class Freq {

    public static void main(String[] args) {

        primes().map(p -> TWO.pow(p.intValueExact()).subtract(ONE))
                .filter(mersenne -> mersenne.isProbablePrime(50))
                .limit(20)
                .forEach(System.out::println);

    }

    static Stream<BigInteger> primes() {
        return Stream.iterate(BigInteger.TWO, i -> i.add(BigInteger.ONE));
    }


}
