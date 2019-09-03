package com.kodcu.question02;


/**
 * 1-  Measure the performance of the main() method
 * 2 - Can you make isRomanNumeral() method faster ?
 */
public class Roman {

    static boolean isRomanNumeral(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }


    private static final String ALPHA_NUMERIC_STRING = "!?&ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static String randomAlphaNumeric(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }


    public static void main(String[] args) {

        System.out.println(isRomanNumeral(randomAlphaNumeric(10)));

    }
}
