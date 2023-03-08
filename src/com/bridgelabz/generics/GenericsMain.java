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

//        MaxValue maxVal = new MaxValue();
//
//        System.out.println("\nTest Case 1:");
//        maxVal.maxValue(93, 54, 64);
//
//        System.out.println("Test Case 2:");
//        maxVal.maxValue(54, 88, 64);
//
//        System.out.println("Test Case 3:");
//        maxVal.maxValue(54, 64, 80);
//
//
//        System.out.println("\nTest Case 1:");
//        maxVal.maxValue(93.6F, 54.54F, 64.43F);
//
//     System.out.println("Test Case 2:");
//        maxVal.maxValue(54.43F, 88.65F, 64.43F);
//
//        System.out.println("Test Case 3:");
//        maxVal.maxValue(54.33F, 64.45F, 80.76F);
//
//
//        System.out.println("\nTest Case 1:");
//        maxVal.maxValue("Peach", "Apple", "Banana");
//
//        System.out.println("Test Case 2:");
//        maxVal.maxValue("Apple", "Peach", "Banana");
//
//        System.out.println("Test Case 3:");
//        maxVal.maxValue("Apple", "Banana", "Peach");
    }


}
