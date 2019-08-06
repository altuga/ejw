package com.kodcu.question10;

import java.math.BigDecimal;


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
 1 - Run the app.
 2 - Any abnormality ? If yes try fix it - 5 mins
 3 - Instructor will show the solutions
 4 - Refactor and ask questions 
*/
public class Money {

    public static void main(String[] args) {
        BigDecimal funds = new BigDecimal("1.00");
        int itemsBought = 0;
        for (BigDecimal price = new BigDecimal("0.10"); 
                funds.compareTo(price) >= 0; price = price.add(new BigDecimal("0.10"))) {
            funds = funds.subtract(price);
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Change: $" + funds);
    }
}
