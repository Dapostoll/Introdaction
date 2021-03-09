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
        java.util.Arrays.sort(myArray);
        System.out.println(java.util.Arrays.toString(myArray));
        int array_0 = myArray[0];
        int array_2 = myArray[2];
        int array_4 = myArray[4];
        int array_6 = myArray[6];
        int array_8 = myArray[8];
        int array_1 = myArray[1];
        int array_3 = myArray[3];
        int array_5 = myArray[5];
        int array_7 = myArray[7];
        int array_9 = myArray[9];
//        Спрятал то, как приравнивал каждую ячейку памяти инту
        int result = array_0 %2;
        //        нечетное
        int result_1 = array_1 %2;
        //        четное
        int result_2 = array_2 %2;
        //        нечетное
        int result_3 = array_3 %2;
        //        четное
        int result_4 = array_4 %2;
        //        нечетное
        int result_5 = array_5 %2;
        //        четное
        int result_6 = array_6 %2;
        //        нечетное
        int result_7 = array_7 %2;
        //        четное
        int result_8 = array_8 %2;
        //        нечетное
        int result_9 = array_9 %2;
        //        четное
        System.out.println(result);
        System.out.println(result_1);
        System.out.println(result_2);
        System.out.println(result_3);
        System.out.println(result_4);
        System.out.println(result_5);
        System.out.println(result_6);
        System.out.println(result_7);
        System.out.println(result_8);
        System.out.println(result_9);
        // спрятал, System.out.println(), чтобы не мешал...

        int[] myArrayChet = {array_1, array_3, array_5, array_7, array_9};
        int[] myArrayNeChet = {array_0, array_2, array_4, array_6, array_8};
        java.util.Arrays.sort(myArrayChet);
        java.util.Arrays.sort(myArrayNeChet);
        System.out.println(java.util.Arrays.toString(myArrayChet));
        System.out.println(java.util.Arrays.toString(myArrayNeChet));
        // Не понял задание, не уверен что это нужно было показывать и делать в том числе.
        int arrayu_1 = array_1 * 2;
        int arrayu_2 = array_3 * 2;
        int arrayu_3 = array_5 * 2;
        int arrayu_4 = array_7 * 2;
        int arrayu_5 = array_9 * 2;
//        Умножение вдвое
        int arrayo_1 = array_0 - 2;
        int arrayo_2 = array_2 - 2;
        int arrayo_3 = array_4 - 2;
        int arrayo_4 = array_6 - 2;
        int arrayo_5 = array_8 - 2;
//        Уменшение на 2
        int[] myFinishArray = {arrayo_1, arrayu_1, arrayo_2, arrayu_2, arrayo_3, arrayu_3, arrayo_4, arrayu_4, arrayo_5, arrayu_5};
//        java.util.Arrays.sort(myFinishArray);
        // Решил что нужно вывести начальный массив и потом его же, но с изминениями, надеюсь я правильно понял задание
        System.out.println(java.util.Arrays.toString(myArray));
        System.out.println("начальный массив");
        System.out.println(java.util.Arrays.toString(myFinishArray));
        System.out.println("измененный массив");











    }
}
