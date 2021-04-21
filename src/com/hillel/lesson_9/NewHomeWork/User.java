package com.hillel.lesson_9.NewHomeWork;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class User {
   public File file(){  File pathToFile = new File("C:\\poem\\myHomework_9.txt"); return pathToFile;}
    protected String name;
    protected String surname;
    protected String email;
    protected String password;
    protected String country;

    public User() {
    }

    public User(String name, String surname, String email, String password, String country) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.country = country;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
 public String enteredTextForConsole(Scanner sc) {
    System.out.println("Enter text for Console");
    String fileString = sc.nextLine();
     System.out.println(fileString);
    return fileString;
}


    public  FileWriter writeToFile(File pathToFile, String fileString) throws IOException {
        System.out.println("You're entered text write to file");

        FileWriter fileWriter = new FileWriter(pathToFile);
        fileWriter.write(fileString);
        fileWriter.close();
        return fileWriter;
    }

    public  void scannerClose(Scanner sc) {
        sc.close();
    }


     public Scanner sc(){ Scanner sc = new Scanner(System.in); return sc;}


}
