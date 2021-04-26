package com.hillel.lesson_13.homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class QuestionnaireAndList {
    static LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

    public void questionnaire() throws IOException {
        File fileFile = new File("C:\\poem\\questionnaire.txt");
        String file = "C:\\poem\\questionnaire.txt";
        FileWriter fileWriter = new FileWriter(file);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! \nI'm Questionnaire");
        System.out.println("Enter your name\n");
        String keyName_1 = scanner.nextLine();
        String questionKey_1 = "\nAre you from the CIS countries (those who left the CIS are also considered)?\n Enter only yes, or no\n";
        System.out.println(questionKey_1);
        String questionAnswer_1 = scanner.nextLine();
        if (questionAnswer_1.equalsIgnoreCase("yes")) {
            System.out.println("Okay,It's good");
        } else if (questionAnswer_1.equalsIgnoreCase("no")) {
            System.out.println("This is a problem for you");
        } else {
            System.out.println("Read rules again, and try again");
            System.exit(0);
        }
        String questionKey_2 = "\nWhere are you from?\n";
        System.out.println(questionKey_2);
        String questionAnswer_2 = scanner.nextLine();
        scanner.close();
        System.out.println("Okay,That's all, Thank You");
        linkedHashMap.put(keyName_1, linkedHashMap.put(questionKey_1, questionAnswer_1));
        linkedHashMap.put(keyName_1, linkedHashMap.put(questionKey_2, questionAnswer_2));
        System.out.println(linkedHashMap);
        fileWriter.write(linkedHashMap.toString());
        fileWriter.close();


    }
}

