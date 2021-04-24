package com.hillel.lesson10.homework.ComputerGame;

public interface DeleteGame {
    default String delete() {
        String delete = "Game deleted";
        return delete;
    }
}
