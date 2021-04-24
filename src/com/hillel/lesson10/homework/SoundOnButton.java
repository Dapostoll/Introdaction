package com.hillel.lesson10.homework;

public interface SoundOnButton extends SoundOffButton {

    @Override
    default String soundOff() {
        return null;
    }

    default void soundOn(String soundOff) {
        if (soundOff.equals("Sound off")) {
            System.out.println("Sound is on");
            soundOff = "Sound on";
        }else
            System.out.println("Sound is already on");
        }

    }
