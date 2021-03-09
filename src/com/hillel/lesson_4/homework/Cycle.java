package com.hillel.lesson_4.homework;

import java.util.Arrays;
import java.util.List;

public class Cycle {
    public static void main(String[] args) {
        int arrays[] = {5, 4, 3, 2, 1, 6, 7, 59, 9, 8};
//        int max = arrays[0];
//        for (int i = 0; i < 10; i++){
//            if (arrays[i] > max)
//                max = arrays[i];
//        }
//        System.out.println("Max - " + max);
//        int min = arrays[0];
//        for (int i = 0; i < 10; i++){
//            if (arrays[i] < min)
//                min = arrays[i];
//        }
//        System.out.println("Min - " + min);
//
        for (int i = 0; i < arrays.length; i++){
            if (arrays[i] % 2 == 0) {
                System.out.println(arrays[i] + " - это число четное");
            }else {
                System.out.println(arrays[i] + " - это число не четное");
            }
        }

    }
}
