package com.hillel.lesson_7.homework;

import java.util.Scanner;

public class Question {
    static Scanner sc = new Scanner(System.in);

    public static void petsNameCatQuestion(Cat homelessCat) {
        String checkerY = "y";
        String checkerN = "n";
        System.out.println("\n Do you want to give names to cat? \nIf yes, write Y, if not, write N\n");

        String nextValue = sc.nextLine();
        boolean answerYes = checkInputY(checkerY, nextValue);
        boolean answerNo = checkInputN(checkerN, nextValue);
        if (answerYes) {
            System.out.println("\n Please enter name for Cat\n");
            String nameCat = sc.nextLine();
            homelessCat.setName(nameCat);
            System.out.println("\n The Cat's name is : " + homelessCat.getName());


        } else if (answerNo) {
            System.out.println("\n Okay, the cat will be nameless.");

        } else {
            System.out.println("\n You writed wrong cymbol, restart program and write only y or n");

        }
    }

    public static void petsNameDogQuestion(Dog homelessDog) {
        String checkerY = "y";
        String checkerN = "n";
        System.out.println("\n Do you want to give names to dog? \nIf yes, write Y, if not, write N\n");
        String nextValue = sc.nextLine();
        boolean answery = checkInputY(checkerY, nextValue);
        boolean answern = checkInputN(checkerN, nextValue);
        if (answery) {
            System.out.println("\nPlease enter name for Dog\n");
            String nameDog = sc.nextLine();
            homelessDog.setName(nameDog);
            System.out.println("\n The Dog's name is : " + homelessDog.getName());


        } else if (answern) {
            System.out.println("\n Okay, the dog will be nameless.");

        } else {
            System.out.println("\n You writed wrong cymbol, restart program and write only Y or N");
        }


    }

    public static void checkerPets(Cat homelessCat, Dog homelessDog){
        System.out.println("\n Do you want to use checker? \nIf yes, write Y, if not, write N\n");
        String checkerY = "y";
        String checkerN = "n";
        String nextValue = sc.nextLine();
        boolean answerYes = checkInputY(checkerY, nextValue);
        boolean answerNo = checkInputN(checkerN, nextValue);
        if (answerYes) {
            System.out.println("\n First, we use the checker on the cat");
            Cat.breedCatChecker(homelessCat);
            Cat.sexCatChecker(homelessCat);
            Cat.ageCatChecker(homelessCat);
            System.out.println("\n Now we use the checker on the dog");
            Dog.breedDogChecker(homelessDog);
            Dog.sexDogChecker(homelessDog);
            Dog.ageDogChecker(homelessDog);
            System.out.println("\n And now you know everything about your new pets\n Good luck.");





        } else if (answerNo) {
            System.out.println("\n Well, nothing will be known about the pets.");

        } else {
            System.out.println("\n You writed wrong cymbol, restart program and write only Y or N");
        }


    }

    private static boolean checkInputY(String checkerY, String nextValue) {
        boolean answerY = checkerY.equalsIgnoreCase(nextValue);
        return answerY;
    }

    private static boolean checkInputN(String checkerN, String nextValue) {
        boolean answerN = checkerN.equalsIgnoreCase(nextValue);
        return answerN;
    }

    public static void scannerClose() {
        sc.close();
    }
}
