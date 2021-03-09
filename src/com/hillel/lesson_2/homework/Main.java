package com.hillel.lesson_2.homework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(" task 1 ");

        int a = 0;
        int a_1 = a++;
        System.out.println(a);
        System.out.println(a_1);

        int b = 0;
        int b_1 = ++b;
        System.out.println(b);
        System.out.println(b_1);

        int c = 2;
        int c_1 = c--;
        System.out.println(c);
        System.out.println(c_1);

        int d = 2;
        int d_1 = --d;
        System.out.println(d);
        System.out.println(d_1);

        System.out.println(" task 3 ");

        byte bytev = 10;
        short shortv = 100;
        int intv = 1000;

        double doublev = 15.5;
        float floatv = 5.5f;
        double doublev_2 = 13.6;

        bytev = (byte) doublev;
        shortv = (short) floatv;
        doublev_2 = (double) intv;
//        System.out.println(bytev);
//        System.out.println(shortv);
//        System.out.println(doublev_2);
        System.out.println(bytev + doublev + shortv + floatv + intv + doublev_2);




        System.out.println();

        System.out.println(" task 4 ");

        /**
         * hi
         */
//         hi
        /* hi
                hi
                hi*/
        System.out.println(" task 5 ");

        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(myArray.length);








    }
}
