package com.hillel.lesson_7.homework;

public class Main {
    public static void main(String[] args) {
        Cat homelessCat = new Cat("Unknown", "Unknown", "Unknown", "Unknown");
        Dog homelessDog = new Dog("Unknown", "Unknown", "Unknown", "Unknown");
        System.out.println("\n Congratulations, you found 2 pets, a cat and a dog. \nBefore they were homeless, so they have no names and nothing is known about them"
                + "\n\n But I think this is not a problem for you \nYou can come up with a name yourself and find out their age, gender and breed using a special checker");
        System.out.println("\n And now is the time to give them a name");
        Question.petsNameCatQuestion(homelessCat);
        System.out.println("\n");
        Question.petsNameDogQuestion(homelessDog);
        System.out.println("\n Great, now that they have a name, it's time to use the basic animal information checker");
        Question.checkerPets(homelessCat,homelessDog);
        Question.scannerClose();


    }
}
