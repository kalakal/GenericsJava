package com.bridgelabz.generics;

public class GenericsMain {
    public static void main(String[] args) {
        System.out.println("|-- Generics Max Value Program --|");

        MaxValue maxInt = new MaxValue();

        System.out.println("\nTest Case 1:");
        maxInt.maxInt(93, 54, 64);

        System.out.println("Test Case 2:");
        maxInt.maxInt(54, 88, 64);

        System.out.println("Test Case 3:");
        maxInt.maxInt(54, 64, 80);
    }
}