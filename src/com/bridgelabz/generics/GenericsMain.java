package com.bridgelabz.generics;

public class GenericsMain {
    public static void main(String[] args) {
        System.out.println("|-- Generics Max Value Program --|\n");

        MaxValue<Integer> maxVal1 = new MaxValue<>(93, 54, 64);
        maxVal1.testMaximum();

        MaxValue<Float> maxVal2 = new MaxValue<>(93.6F, 54.54F, 64.43F);
        maxVal2.testMaximum();

        MaxValue<String> maxVal3 = new MaxValue<>("Peach", "Apple", "Banana");
        maxVal3.testMaximum();
    }
}