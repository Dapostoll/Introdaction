package com.hillel.lesson_9.NewHomeWork;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        User user = new User("Danil", "Myastovskii", "1dantver1@gmail.com", "1234", "Ukraine");
        Support support = new Support();
        user.file();
        user.sc();
        user.writeToFile(user.file(), user.enteredTextForConsole(user.sc()));
        support.stringChecker(support.enteredTextForConsole(support.sc()),support.file() );





    }
}
