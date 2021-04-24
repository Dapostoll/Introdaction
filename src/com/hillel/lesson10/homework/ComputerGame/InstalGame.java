package com.hillel.lesson10.homework.ComputerGame;

public interface InstalGame extends DeleteGame {
    default void instalGame(String delete) {
        if (delete.equals("Game deleted")) {
            System.out.println("Game is installed");
        }else
            System.out.println("Game is already installed");
    }
}
