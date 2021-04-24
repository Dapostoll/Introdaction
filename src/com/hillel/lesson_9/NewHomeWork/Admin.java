package com.hillel.lesson_9.NewHomeWork;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.util.Scanner;
import java.io.File;

final public class Admin extends User {
    public Admin() {
        super();
    }


    public void removeFile(boolean isContain) {
        if(isContain){
            System.out.println("Since the file is contains, it has been deleted");
            File file = new File("C:\\poem\\myHomework_9.txt");
            file.delete();
        }else {
            System.out.println("Since the file does not contain, it not has been deleted");
        }
    }

}
