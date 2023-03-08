package com.bridgelabz.generics;

    public class MaxValue<K extends Comparable<K>> {

        K var1;
        K var2;
        K var3;

        public MaxValue(K var1, K var2, K var3) {
            this.var1 = var1;
            this.var2 = var2;
            this.var3 = var3;
        }

        public void testMaximum(){
            testMaximum(var1, var2, var3);
        }

        static <K extends Comparable<K>> void testMaximum(K val1, K val2, K val3){

            if((val1.compareTo(val2)) >= 0 && (val1.compareTo(val3)) >= 0)
                System.out.println(val1 + " is largest\n");

            else if ((val2.compareTo(val1)) >= 0 && (val2.compareTo(val3)) >= 0)
                System.out.println(val2 + " is largest\n");

            else
                System.out.println(val3 + " is largest");
        }
    }

