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
        fNumber = 0;
        dNumber = 0;
        bNumber = BigDecimal.ZERO;

        for (int i = 0; i < 1000; i++) {

            fNumber += 19.99f;
            dNumber += 19.99;
            bNumber = bNumber.add(new BigDecimal("19.99"));

        }
        System.out.println();
        System.out.println("Float equals Double: " + (fNumber == dNumber));
        System.out.println("BigDecimal: " + (bNumber.compareTo(new BigDecimal(dNumber))));

        System.out.println("Float number: " + fNumber + " | Double number: " + dNumber + " | BigDecimal number: " + bNumber);
    }
}
