package com.hillel.lesson_7.homework;

import java.util.Random;
import java.util.Scanner;

public class Cat {

    private String name;

    private String age;

    private String sex;

    private String breed;

    public Cat() {
        this.name = "Unknown";
    }

    public Cat(String name, String age, String sex, String breed) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    public static void breedCatChecker(Cat homelessCat) {
        Random randomBreed = new Random();
        System.out.println("\n Checker checks the breed of a Cat");
        int randomBreedResult = randomBreed.ints(0,5).iterator().nextInt();

        if (randomBreedResult == 0) {
            homelessCat.setBreed("Siberian");
            System.out.println("Cat breed is : " + homelessCat.getBreed());

        }
        if (randomBreedResult == 1) {
            homelessCat.setBreed("British Shorthair");
            System.out.println("Cat breed is : " + homelessCat.getBreed());

        }
        if (randomBreedResult == 2) {
            homelessCat.setBreed("Scottish fold");
            System.out.println("Cat breed is : " + homelessCat.getBreed());

        }
        if (randomBreedResult == 3) {
            homelessCat.setBreed("Maine Coon");
            System.out.println("Cat breed is : " + homelessCat.getBreed());

        }
        if (randomBreedResult == 4) {
            homelessCat.setBreed("Sphinxes");
            System.out.println("Cat breed is : " + homelessCat.getBreed());

        }
        if (randomBreedResult == 5) {
            homelessCat.setBreed("Persian");
            System.out.println("Cat breed is : " + homelessCat.getBreed());

        }

    }

    public static void ageCatChecker(Cat homelessCat) {
        Random catChecker = new Random();
        System.out.println("\n Checker checks the age of a Cat");
        String catAge = String.valueOf(catChecker.ints(1, 15).iterator().nextInt());
        homelessCat.setAge(catAge);
        System.out.println("Cat age is : " + homelessCat.getAge());
    }

    public static void sexCatChecker(Cat homelessCat) {
        Random randomSex = new Random();
        System.out.println("\n Checker checks the sex of a Cat");
        int randomSexResult = randomSex.ints(1, 2).iterator().nextInt();

        if (randomSexResult == 1) {
            homelessCat.setSex("Male");
            System.out.println("Cat sex is : " + homelessCat.getSex());
        }if (randomSexResult == 2){
            homelessCat.setSex("Female");
            System.out.println("Cat sex is : " + homelessCat.getSex());
        }
    }
}

