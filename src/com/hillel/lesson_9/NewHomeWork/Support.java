package com.hillel.lesson_9.NewHomeWork;

import java.io.*;
import java.util.Scanner;

final public class Support extends User {
    public Support() {
        super();
    }


    @Override
    public File file() {
        return super.file();
    }

    @Override
    public String enteredTextForConsole(Scanner sc) {
        return super.enteredTextForConsole(sc);

    }

    @Override
    public Scanner sc() {
        return super.sc();
    }

    public String stringChecker(String fileString, File pathToFile) throws IOException {
        System.out.println("Enter text for check in file");
        BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
        String value = reader.readLine();
//        while (value.equalsIgnoreCase(fileString)){
//            System.out.println(value);
//        }

        if (fileString.equalsIgnoreCase(value)) {
            System.out.println("contains");
//            stringCheckerResult = "contains";
        } else {
            System.out.println("does not contain");
//            stringCheckerResult = "does not contain contain";
        }
return value;
    }
}


