package com.hillel.lesson_4.homework;

public class Method {
    public static int task_1() {

        int a = 0;

        int b = 10;

        while (a < b) {

            a = a + 1;

            System.out.println(a);
        }
        return a;
    }

    public static int task_2() {

        int a = 1;

        int b = 11;

        for (a = 1; a < b; a++) {
            System.out.println(a);
        }
        return a;

    }

    public static int task_3() {

        int a = 110;

        int b = 0;

        while (a > b) {
            a = a - 10;
            System.out.println(a);
        }
        return a;

    }

    public static int task_4() {

        int a = 109;

        int b = 0;

        for (a = 109; a > b; a--) {
            a = a - 9;
            System.out.println(a);
        }
        return a;
    }

}

