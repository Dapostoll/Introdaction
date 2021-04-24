package com.hillel.lesson_9.NewHomeWork;

import java.io.File;
import java.io.IOException;


public class Main {
    static boolean isContain;


    public static void main(String[] args) throws IOException {
        User user = new User("Danil", "Myastkovskii", "1dantver1@gmail.com", "1234", "Male", "Ukraine");
        Support support = new Support();
        Admin admin = new Admin();
        ((User) user).fileCreator();
//        user.fileCreator();
//        user.scannerSystemIn();
//        user.enteredTextForConsole(user.scannerSystemIn());
//        user.writeToFile(user.scannerSystemIn());
//        support.checkString();
//        admin.removeFile(false);
        System.out.println("Second part");
        method(user);
        method(support);
        method(admin);


    }

    public static void method(User user) throws IOException {
        if(user instanceof Admin){
            ((Admin) user).removeFile(isContain);
        } else if (user instanceof Support){
            isContain = ((Support)user).checkString("1234");
        } else if (user instanceof User) {
            ((User) user).writeToFile();
        }
    }
}
