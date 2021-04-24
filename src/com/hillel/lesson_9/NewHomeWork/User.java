package com.hillel.lesson_9.NewHomeWork;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class User {




    private String name;
    private String surname;
    private String mail;
    private String password;
    private String sex;
    private String country;

    public User() {
    }

    public User(String name, String surname, String mail, String password, String sex, String country) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        this.sex = sex;
        this.country = country;
    }





    public final void enteredTextForConsole() throws IOException {
        String file = "C:\\poem\\myHomework_9.txt";
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()){
            String fileString = scanner.nextLine();
            System.out.println(fileString);
        }
        System.out.println("File have been read");

        scanner.close();
        fileReader.close();

    }


    public void writeToFile() throws IOException {
        String file = "C:\\poem\\myHomework_9.txt";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text for File");
        String text = scanner.nextLine();
        FileWriter fileWriter = new FileWriter(file);
        System.out.println("You're entered text write to file");
        fileWriter.write(text);

        scanner.close();
        fileWriter.close();
    }

    public void fileCreator() {
        try {
            File file = new File("C:\\poem\\myHomework_9.txt");
            if (file.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
