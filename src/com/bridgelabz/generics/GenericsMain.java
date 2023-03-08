package com.bridgelabz.generics;

public class GenericsMain {
    public static void main(String[] args) {
        System.out.println("|-- Generics Max Value Program --|");

        MaxValue maxVal = new MaxValue();

        System.out.println("\nTest Case 1:");
        maxVal.maxFloat(93.6F, 54.54F, 64.43F);

        System.out.println("Test Case 2:");
        maxVal.maxFloat(54.43F, 88.65F, 64.43F);

        System.out.println("Test Case 3:");
        maxVal.maxFloat(54.33F, 64.45F, 80.76F);
    }
}