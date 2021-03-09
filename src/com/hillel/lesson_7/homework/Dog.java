package com.hillel.lesson_7.homework;

import java.util.Random;
import java.util.Scanner;

public class Dog {
    private String name;

    private String age;

    private String sex;

    private String breed;

    public Dog(String name, String age, String sex, String breed) {
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
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
public static void breedDogChecker(Dog homelessDog){
    Random randomBreed = new Random();
    System.out.println("\n Checker checks the breed of a Dog");
    int randomBreedResult = randomBreed.ints(0,5).iterator().nextInt();

    if (randomBreedResult == 0) {
        homelessDog.setBreed("Husky");
        System.out.println("Dog breed is : " + homelessDog.getBreed());

    }
    if (randomBreedResult == 1) {
        homelessDog.setBreed("English bulldog");
        System.out.println("Dog breed is : " + homelessDog.getBreed());

    }
    if (randomBreedResult == 2) {
        homelessDog.setBreed("Rottweiler");
        System.out.println("Dog breed is : " + homelessDog.getBreed());

    }
    if (randomBreedResult == 3) {
        homelessDog.setBreed("Boxer");
        System.out.println("Dog breed is : " + homelessDog.getBreed());

    }
    if (randomBreedResult == 4) {
        homelessDog.setBreed("Pug");
        System.out.println("Dog breed is : " + homelessDog.getBreed());

    }
    if (randomBreedResult == 5) {
        homelessDog.setBreed("German Shepherd");
        System.out.println("Dog breed is : " + homelessDog.getBreed());

    }


}

    public static void ageDogChecker(Dog homelessDog) {
        Random catChecker = new Random();
        System.out.println("\n Checker checks the age of a Dog");
        String catAge = String.valueOf(catChecker.ints(1, 15).iterator().nextInt());
        homelessDog.setAge(catAge);
        System.out.println("Dog age is : " + homelessDog.getAge());
    }
    public static void sexDogChecker(Dog homelessDog) {
        Random randomSex = new Random();
        System.out.println("\n Checker checks the sex of a Dog");
        int randomSexResult = randomSex.ints(1, 2).iterator().nextInt();

        if (randomSexResult == 1) {
            homelessDog.setSex("Male");
            System.out.println("Dog sex is : " + homelessDog.getSex());
        }
        if (randomSexResult == 2) {
            homelessDog.setSex("Female");
            System.out.println("Dog sex is : " + homelessDog.getSex());
        }
    }
}

