package com.bridgelabz.generics;

public class GenericsMain {
    public static void main(String[] args) {
        System.out.println("|-- Generics Max Value Program --|");

        MaxValue maxVal = new MaxValue();

        System.out.println("\nTest Case 1:");
        maxVal.maxString("Peach", "Apple", "Banana");

        System.out.println("Test Case 2:");
        maxVal.maxString("Peach", "Apple", "Banana");

        System.out.println("Test Case 3:");
        maxVal.maxString("Peach", "Apple", "Banana");
    }
}