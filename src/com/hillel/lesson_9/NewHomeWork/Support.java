package com.hillel.lesson_9.NewHomeWork;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

final public class Support extends User {
    public Support() {
    }



    public boolean checkString(String str) throws IOException {
        String file = "C:\\poem\\myHomework_9.txt";
//       String consoleTextResult = fileString.transform(String::toString);
        FileReader fileReader = new FileReader(file);
        Scanner scannerFileReader = new Scanner(fileReader);
        boolean isContain = false;


        while (scannerFileReader.hasNextLine()) {
            String writedText = scannerFileReader.nextLine();
            if (writedText.equals(str)) {
                isContain = true;

            }
        }
        scannerFileReader.close();
        fileReader.close();
        System.out.println("The entered text is present in the file : " + isContain);
        scannerFileReader.close();
        fileReader.close();
        return isContain;




    }

}

