package com.hillel.lesson_14.homework;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptions {

    public void firstException() throws IOException {
        FileWriter fileWriter = new FileWriter("lesson14.txt");
        fileWriter.write("hello");
        fileWriter.close();
    }


    public void secondException(){
        throw new IllegalArgumentException();
    }


    public void thirdException(){
        throw  new ArithmeticException();
    }
}