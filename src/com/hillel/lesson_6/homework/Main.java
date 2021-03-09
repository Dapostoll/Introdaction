package com.hillel.lesson_6.homework;

public class Main {
    public static void main(String[] args) {
        String text = new String(" Hillel is my feature. I will be developer  ");
        System.out.println(text);
       //Проверить не пустой ли заданный текст;
        boolean textIsEmpty = text.isEmpty();
        System.out.println(textIsEmpty);
        // Вывести длину данного текста
        int textLength = text.length();
        System.out.println(textLength);
        // Вывести длину данного текста убрав лишние пробелы вначале и конце текста
        System.out.println(text.trim().length());
        //  Используя команду получения значения из строки по индексу вывести “I”;
        int textIndexOf = text.indexOf("l");
        System.out.println(textIndexOf);
        // Используя команду обрезания вывести “developer”;
        System.out.println(text.substring(33, 42));
        // Добавить в конце строки знак “!”;
        // Добавил трим, чтобы выглядело лучше
        String textConcat = "!";
        System.out.println(text.trim().concat(textConcat));
        // Выполните сравнение заданной строки со строкой: “Hillel is my feature. I will be DEVELOPER” так,
        // чтобы в одном случае они были равны, а в другом не равны;
        String textForEquals = "Hillel is my feature. I will be DEVELOPER";
        System.out.println(text.trim().equalsIgnoreCase(textForEquals));
        System.out.println(text.equals(textForEquals));
        //Выведите данную строку в нижнем регистре;
        System.out.println(text.toLowerCase());
        //Выведите данную строку в верхнем регистре;
        System.out.println(text.toUpperCase());




    }
}
