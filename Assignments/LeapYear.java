package com.ds.bt.Assignments;

import java.time.Year;

public class LeapYear {

    static void main(String[] args) {
        int year = 2025;
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year){

        /**
         * identify the number of days in an year
         */
        int days = Year.of(year).length();
        if(days == 365)
            return true;

        /**
         * api method
         * return Year.of(year).isLeap();
         */
        return false;
    }
}
