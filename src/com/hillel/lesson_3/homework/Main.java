package com.hillel.lesson_3.homework;

import java.util.Random;

import java.util.Scanner;


//Task 2  Создайте 3 переменные типа int и 3 переменные типа double используя класс Random, выполните их сложение
// и выведите результат.

public class Main {

    public static void main(String[] args) {

        System.out.println(" \n Task 2 \n");

        Random random = new Random();

        for (int i = 0; i < 3; i++) {


            for (double d = 0; d < 3; d++) ;
            {
                int resultInt = random.nextInt(10 + 1);

                double resultDouble = 1.0 + 9.0 * random.nextDouble();

                double resultIntAndDouble = resultInt + resultDouble;

                System.out.println(resultIntAndDouble);

            }
        }
        // Task 3 Создать метод, для розыгрыша приза в лотерее среди участников. Внутри метода сделать возможным каждый
        // раз при вызове вводить количество участников(При запуске программы должно спрашивать количество
        // участников(использовать Scanner), вы задаете количество участников и среди них производится розыгрыш).
        // Используя класс Random определить победителя и вывести поздравление в консоль.
        //У данного метода не будет принимаемых параметров и может быть, может не быть возвращаемый параметр
        // с результатом победителя(зависит от того как вы реализуете).

//        System.out.println(" \n Task 3 \n");
//        System.out.println();
//        int scanner = keyboardScannerInputParticipants();
//        System.out.println();
//        Random randomWinner = new Random();
//        int s = scanner;
//        for (int w = 0; w < 1; w++ ){
//            int winner = randomWinner.nextInt(s + 1);
//            System.out.println("The victory was won by number " + winner);
//
//        }

        System.out.println(" \n Task 4 \n");

        //        Task 4 Используя класс Math напишите 7-8 примеров вызовов вспомогательных методов данного класса:
//        о sqrt();
//        o abs();
//        o min();
//        o max();
//        o random();
//        o ….(остальные на Ваш выбор);

        int minDigit = Math.min(100, 45);

        int maxDigit = Math.max(4, 19);

        double squareValue = Math.sqrt(45);

        double moduleValue = Math.abs(-45);

        double randomDigit = Math.random();

        double cbrtValue = Math.cbrt(45);

        double sinValue = Math.sin(45);


        System.out.println(randomDigit);

        System.out.println("min digit value is :" + minDigit);

        System.out.println("max digit value is :" + maxDigit);

        System.out.println("square digit value is :" + squareValue);

        System.out.println("moduleValue digit value is :" + moduleValue);

        System.out.println("cbrt digit value is :" + cbrtValue);

        System.out.println("sin digit value is :" + sinValue);


        System.out.println("\n Task 5 \n");

        //  Создать 2 схожих метода, которые будут случайным образом генерировать Вашу зарплату. Обратите внимание,
        //  что именно метода, а не просто вызовы указанных функций. В одном методе используйте класс Random,
        //  в другом Math.random. Для себя поймите разницу в использовании. Если не хотите получать маленькую зарплату,
        //  то можете выполнить дополнительные действия с Math.random)

        int salaryRandom = salaryRandomMethod();
        int salaryMathRandom = salaryMathRandomMethod();
    }




    public static int keyboardScannerInputParticipants() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of participants:");

        int participants = scanner.nextInt();

        System.out.println("You entered that there are " + participants + " participants");

        return participants;


    }

    public static int salaryRandomMethod() {

        Random salaryRandom = new Random();

        for (int z = 0; z < 1; z++);

        int salaryRandomValue = salaryRandom.nextInt(5000);

        System.out.println("Your random salary is : " + salaryRandomValue + "$");

        return salaryRandomValue;
    }

    public static int salaryMathRandomMethod() {

        int salaryMathRandomValue = (int) (Math.random() * 5000);

        System.out.println("Your math random salary is : " + salaryMathRandomValue + "$");

        return salaryMathRandomValue;
    }




}
