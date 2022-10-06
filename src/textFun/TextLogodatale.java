package textFun;

import java.time.LocalDate;
import java.time.Month;

public class TextLogodatale {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        // LocalDate's plus methods
        System.out.println("Addition of days : " + localDate.plusDays(5)); // Addition of days : 2020-01-09
        System.out.println("Addition of months : " + localDate.plusMonths(15)); // Addition of months : 2021-04-04
        System.out.println("Addition of weeks : " + localDate.plusWeeks(45)); // Addition of weeks : 2020-11-14
        System.out.println("Addition of years : " + localDate.plusYears(5)); // Addition of years : 2025-01-04

        // LocalDate's minus methods
        System.out.println("Subtraction of days : " + localDate.minusDays(5)); // Subtraction of days : 2019-12-30
        System.out.println("Subtraction of months : " + localDate.minusMonths(15)); // Subtraction of months : 2018-10-04
        System.out.println("Subtraction of weeks : " + localDate.minusWeeks(45)); // Subtraction of weeks : 2019-02-23
        System.out.println("Subtraction of years : " + localDate.minusYears(5)); // Subtraction of years : 2015-01-04

    }
    }

