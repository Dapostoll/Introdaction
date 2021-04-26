package com.hillel.lesson_14.homework;

import java.io.IOException;

public class IntermediateClass {
    CheckedExceptions myClassWithCheckedExceptions = new CheckedExceptions();

    public void firstExceptionWith() throws IOException {
        myClassWithCheckedExceptions.firstException();
    }

    public void secondExceptionWith() throws IllegalArgumentException{
        myClassWithCheckedExceptions.secondException();
    }

    public void thirdExceptionWith() throws ArithmeticException{
        myClassWithCheckedExceptions.thirdException();
    }
}