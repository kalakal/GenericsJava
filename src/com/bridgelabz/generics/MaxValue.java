package com.bridgelabz.generics;


    public class MaxValue {

        public <K extends Comparable<K>> void maxValue(K val1, K val2, K val3){

            if((val1.compareTo(val2)) >= 0 && (val1.compareTo(val3)) >= 0)
                System.out.println("First Value: " + val1 + " is largest\n");

            else if ((val2.compareTo(val1)) >= 0 && (val2.compareTo(val3)) >= 0)
                System.out.println("Second Value: " + val2 + " is largest\n");

            else
                System.out.println("Third Value: " + val3 + " is largest");
        }
    }

