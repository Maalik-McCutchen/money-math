package com.pluralsight;

import java.math.BigDecimal;

public class MoneyMath {
    public static void main(String[] args) {

        float fNumber = 0;
        double dNumber = 0;
        BigDecimal bNumber = BigDecimal.ZERO;

        for (int i = 0; i < 10; i++) {

            fNumber += 0.10f;
            dNumber += 0.10;
            bNumber = bNumber.add(new BigDecimal("0.10"));

            System.out.println("Float number: " + fNumber + " | Double number: " + dNumber + " | BigDecimal number: " + bNumber);

        }

    }
}
