package com.bridgelabz.generics;

public class MaxValue {
    void maxFloat(Float val1, Float val2, Float val3){

        if((val1.compareTo(val2)) >= 0 && (val1.compareTo(val3)) >= 0)
            System.out.println("First Value: " + val1 + " is largest\n");

        else if ((val2.compareTo(val1)) >= 0 && (val2.compareTo(val3)) >= 0)
            System.out.println("Second Value: " + val2 + " is largest\n");

        else
            System.out.println("Third Value: " + val3 + " is largest");
    }
}
