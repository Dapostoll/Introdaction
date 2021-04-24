package com.hillel.lesson10.homework;

 public interface SoundOffButton {
   default public String soundOff(){
       String soundOff = "Sound off";
               return soundOff;
   }
}
