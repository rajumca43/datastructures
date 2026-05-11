package com.ds.bt.Assignments;

public class CoupleEligibilty {
    static void main(String[] args) {
        int boyAge = 25;
        int girlAge = 18;
        coupleEligibility(boyAge, girlAge);
    }
    public static void coupleEligibility(int boyAge, int girlAge){
        if (boyAge >= 21 && girlAge >= 18) {
            System.out.println("Couple is eligible for marriage.");
        } else {
            System.out.println("Couple is not eligible for marriage.");
        }
    }
}
