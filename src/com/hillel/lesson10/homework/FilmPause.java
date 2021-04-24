package com.hillel.lesson10.homework;

public interface FilmPause {

    default void pause(){
        boolean pause;
        if (pause = true){
            System.out.println("Pause on");
            pause = false;
        }else if (pause = false){
            System.out.println("Pause off");
            pause = true;
        }
    }
}
