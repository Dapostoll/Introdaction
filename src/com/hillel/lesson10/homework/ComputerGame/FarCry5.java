package com.hillel.lesson10.homework.ComputerGame;

final public class FarCry5 extends ShooterGame {

    private String mainDeveloperCompany;
    private String haveMultiplayer;

    public FarCry5(String mainGenre, String engine, String gameName, String dateOfIssue, String mainDeveloperCompany, String haveMultiplayer) {
        super(mainGenre, engine, gameName, dateOfIssue);
        this.mainDeveloperCompany = mainDeveloperCompany;
        this.haveMultiplayer = haveMultiplayer;
    }

    @Override
    public void runGame() {
        System.out.println(getGameName() + " is launched \n" + getGameName() + " is started\n");
    }


    @Override
    public void closeGame() {
        System.out.println(getGameName() + " is closing \n" + getGameName() + " is closed\n");
    }

    public String getMainDeveloperCompany() {
        return mainDeveloperCompany;
    }

    public void setMainDeveloperCompany(String mainDeveloperCompany) {
        this.mainDeveloperCompany = mainDeveloperCompany;
    }

    public String getHaveMultiplayer() {
        return haveMultiplayer;
    }

    public void setHaveMultiplayer(String haveMultiplayer) {
        this.haveMultiplayer = haveMultiplayer;
    }


    public void checkingForUpdates() {
        System.out.println(getGameName() + " checking for updates \nNo updates found\n");
    }

    @Override
    public String toString() {
        return "FarCry5{" +
                "mainDeveloperCompany='" + mainDeveloperCompany + '\'' +
                ", haveMultiplayer='" + haveMultiplayer + '\'' +
                '}';
    }
}
