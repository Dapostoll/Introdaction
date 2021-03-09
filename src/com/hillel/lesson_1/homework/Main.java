package com.hillel.lesson_1.homework;

public class Main {

    public static void main(String[] args) {
        String message = "my text";
        int x = 10;
        int y;
        y = 100;
        boolean isTrue = true;
        boolean isFalse;
        isFalse = false;
        byte z = 126;
        byte c;
        c = 120;
        short v = 32000;
        short b;
        b = 32001;
        long n = 99999999;
        long m;
        m = 99999998;
        float a = 9.5f;
        float s;
        s = 9.6f;
        char name = 'd';
        char number = '3';
        char lastName;
        lastName = 'g';
        char lastNumber;
        lastNumber = '4';
        int h = 12, j = 14, k;
        k = 42;
        double t = 12.2, i = 14.4, u;
        u = 42.24;


        int result = x + c + h;
        int result1 = x - c + j - k;
        int result2 = x * c + k * j;
        int result3 = c / x;
        int result4 = c / x + x + c;
        double result5 = t + h + j;
        double result6 = t - h + j - i;
        double result7 = t - h * j - i;
        double result8 = t / h * j / i;
        double result9 = t + h * i + u / j + i;


        int a1 = 5;
        a1 += 15;
        double a2 = 2.3;
        a2 -= 0.2;
        int a3 = 32;
        a3 *= 5;
        int a4 = 99;
        a4 *= 0;
        double a5 = 6.7;
        a5 /= 3;

        int a6 = 1;
        a6 -= 32;
        double a7 = 7.6;
        a7 *= 5.4;
        int a8 = -42;
        a8 *= -3;
        int a9 = 105;
        a9 -= 135;
        long a10 = 9999;
        a10 *= 99;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);
        System.out.println(a8);
        System.out.println(a9);
        System.out.println(a10);


        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);

        System.out.println("don't panic");
        System.out.println(message);
        System.out.println(x + y);
        System.out.println(x * y);
        System.out.println(y / x);
        System.out.println(isTrue);

        System.out.println(h + y > x);
        System.out.println(a > b);
        System.out.println(b * n + x + a < b);
        System.out.println(b / x + y > h * z);
        System.out.println(x - c + j - k > t + h * i + u / j + i);


    }
}
