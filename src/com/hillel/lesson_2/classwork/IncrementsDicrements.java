package com.hillel.lesson_2.classwork;

public class IncrementsDicrements {
    public static void main(String[] args) {

        int a = 1;
        int b = ++a;

        int c = 1;
        int d = c++;

        System.out.println(a);
        System.out.println(b);

        System.out.println("++a");

        System.out.println(c);
        System.out.println(d);
        System.out.println("c++");


        int x = 10;
        int y = --x;

        int w = 10;
        int z = w--;

        System.out.println(x);
        System.out.println(y);
        System.out.println("--x");


        System.out.println(w);
        System.out.println(z);
        System.out.println("w--");
    }
}
