package com.hillel.lesson10.homework.ComputerGame;

final public class BioShockInfinite extends ShooterGame {

    private String mainDeveloperCompany;
    private String haveMultiplayer;

    public BioShockInfinite(String mainGenre, String engine, String gameName, String dateOfIssue, String mainDeveloperCompany, String haveMultiplayer) {
        super(mainGenre, engine, gameName, dateOfIssue);
        this.mainDeveloperCompany = mainDeveloperCompany;
        this.haveMultiplayer = haveMultiplayer;
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

    @Override
    public void runGame() {
        System.out.println(getGameName() + " is launched \n" + getGameName() + " is started\n");
    }


    @Override
    public void closeGame() {
        System.out.println(getGameName() + " is closing \n" + getGameName() + " is closed\n");
    }


    public void checkingForUpdates() {
        System.out.println(getGameName() + " checking for updates \nNo updates found\n");
    }

    @Override
    public String toString() {
        return "BioShockInfinite{" +
                "mainDeveloperCompany='" + mainDeveloperCompany + '\'' +
                ", haveMultiplayer='" + haveMultiplayer + '\'' +
                '}';
    }
}
