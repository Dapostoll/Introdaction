package com.hillel.lesson10.homework.ComputerGame;

public abstract class ShooterGame extends ComputerGame implements DeleteGame,InstalGame {

    private String gameName;
    private String dateOfIssue;

    public ShooterGame(String additionalGenre, String engine, String gameName, String dateOfIssue) {
        super(additionalGenre, engine);
        this.gameName = gameName;
        this.dateOfIssue = dateOfIssue;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }


    public abstract void closeGame();
}
