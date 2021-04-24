package com.hillel.lesson10.homework.ComputerGame;

public abstract class ComputerGame implements DeleteGame,InstalGame{
    private String mainGenre;
    private String engine;

    public ComputerGame(String mainGenre, String engine) {
        this.mainGenre = mainGenre;
        this.engine = engine;
    }

    public abstract void runGame();

    public String getMainGenre() {
        return mainGenre;
    }

    public void setMainGenre(String mainGenre) {
        this.mainGenre = mainGenre;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }


}
