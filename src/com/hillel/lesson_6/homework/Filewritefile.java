package com.hillel.lesson_6.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Filewritefile {

    static String pathToFile = "C:\\poem\\myTextFile.txt";

    public static void main(String[] args) throws IOException {
        String path = "C:\\poem\\myTextFile.txt";



        writeToFile(pathToFile);

//        readFromFile(pathToFile);

        readFromFileByScanner(pathToFile);

    }
    private static void writeToFile(String pathToFile) throws IOException {
        FileWriter fileWriter = new FileWriter(pathToFile);
        fileWriter.write("Кот купил себе варенье \nНес его он с нетерпением \nДома слопал с настроеньем \nВот и все стихотворенье");
        fileWriter.close();
    }
    private static void readFromFile(String pathToFile) throws IOException {
        char[] myCharArray = new char[1000];


        FileReader fileReader = new FileReader(pathToFile);
        fileReader.read(myCharArray);

        System.out.println("Файл может быть прочитан \n");
        System.out.println(Arrays.toString(myCharArray));

        fileReader.close();
    }
    private static void readFromFileByScanner(String pathToFile) throws IOException {

        FileReader fileReader = new FileReader(pathToFile);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            String fileString = scanner.nextLine();
            System.out.println("Read one string from file :");
            System.out.println(fileString);
        }

        scanner.close();
        fileReader.close();
    }
}
