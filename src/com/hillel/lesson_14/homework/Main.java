package com.hillel.lesson_14.homework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        IntermediateClass intermediateClass = new IntermediateClass();
        try {
            intermediateClass.firstExceptionWith();
            intermediateClass.secondExceptionWith();
            intermediateClass.thirdExceptionWith();
        } catch (IOException e) {
            System.out.println("exceptions is caught");
        } finally {
            System.out.println("try-catch-finally");
        }

        try {
            intermediateClass.firstExceptionWith();
            intermediateClass.secondExceptionWith();
            intermediateClass.thirdExceptionWith();
        } catch (IOException | RuntimeException  e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        } finally {
            System.out.println("try-catch-catch-finally");
        }

        try {
            intermediateClass.firstExceptionWith();
            intermediateClass.secondExceptionWith();
            intermediateClass.thirdExceptionWith();
        } catch (IOException | ArithmeticException | IllegalArgumentException  e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        } finally {
            System.out.println("try-catch-catch-catch-finally");
        }

        try(FileWriter fileWriter = new FileWriter("lesson14.txt")){
            fileWriter.write("something");

            intermediateClass.firstExceptionWith();
            intermediateClass.secondExceptionWith();
            intermediateClass.thirdExceptionWith();
        } catch (Exception e) {
            System.out.println("one more exceptions is caught");;
        } finally {
            System.out.println("try with resources");
        }

        try {
            intermediateClass.firstExceptionWith();
            intermediateClass.secondExceptionWith();
            intermediateClass.thirdExceptionWith();
        } finally {
            System.out.println("try-finally");
        }
    }
}