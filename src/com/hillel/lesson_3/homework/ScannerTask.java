package com.hillel.lesson_3.homework;

import java.util.Scanner;

public class ScannerTask {

    public static void main(String[] args) {

//        Task 1 : Используя класс Scanner, написать  программу, которая будет запрашивать пользователя ввести данные о
//        себе для регистрации и после введенных данных будет выводить всю информацию в консоль:
//        o Введите Ваше имя:
//        о Введите Вашу фамилию:
//        о Укажите сколько Вам полных лет:
//        о Введите Вашу почту для регистрации:
//        о Напишите несколько слов о себе:

        System.out.println("Enter your name please :");

        Scanner scanner = new Scanner(System.in);

        String enteredName = scanner.nextLine();

        System.out.println(enteredName + ", Thank you");

        System.out.println(enteredName + ", Enter your surname please");

        String enteredSurname = scanner.nextLine();

        String fullName = enteredName + " " + enteredSurname;

        System.out.println(fullName + ", Nice to meet you");

        int scannerAge = keyboardScannerInputInteger();

        String email = keyboardScannerInputEmail();

        System.out.println("Enter some information about yourself");

        String information = scanner.next();

        System.out.println("This's interested, Thank you");

        scanner.close();

    }
    public static int keyboardScannerInputInteger() {


        System.out.println("Enter your age please : ");

        Scanner scannerInput = new Scanner(System.in);

        int enteredAge = scannerInput.nextInt();

        System.out.println(enteredAge + ", years old. That's good");

        return enteredAge;


    }
    public static String keyboardScannerInputEmail() {

        System.out.println("Enter your email for registration");

        Scanner scanner = new Scanner(System.in);

        String emailAddress = scanner.next();

        return "Your email is " + emailAddress;

        // Сначала не понял суть задания, а когда понял, вместо того чтобы все переписывать, решил показать на 2
//        примерах что понимаю что нужно сделать


    }
}

