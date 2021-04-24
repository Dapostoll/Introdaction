package com.hillel.lesson10.homework;


import com.hillel.lesson10.homework.ComputerGame.BioShockInfinite;
import com.hillel.lesson10.homework.ComputerGame.FarCry5;
import com.hillel.lesson10.homework.ComputerGame.Titanfall2;

public class Main {
    public static void main(String[] args)  {
        System.out.println("\n            Computer Games\n---------------------------------------------------");
        BioShockInfinite bioshock = new BioShockInfinite("Shooter","Unreal Engine 3","BioShock Infinite","26.03.2013","Irrational Games","Yes");
        bioshock.runGame();
        bioshock.checkingForUpdates();
        bioshock.closeGame();
        FarCry5 farcry = new FarCry5("Shooter","Dunia Engine v2","Far Cry 5","27.03.2018","Ubisoft","Yes");
        farcry.runGame();
        farcry.checkingForUpdates();
        farcry.closeGame();
        Titanfall2 titanfall = new Titanfall2("Shooter","Source","Titanfall 2","28.10.2016","Respawn Entertainment","Yes");
        titanfall.runGame();
        titanfall.checkingForUpdates();
        titanfall.closeGame();
        System.out.println("\n            Films\n---------------------------------------------------");
        EdgeOfTheFuture edgeOfTheFuture = new EdgeOfTheFuture("Action Movie","Doug Lyman","Edge of the future","28.05.2014","178M $","Village Roadshow Pictures, Warner Bros., 3 Arts Entertainment");
        edgeOfTheFuture.runFilm();
        edgeOfTheFuture.closeFilm();
        edgeOfTheFuture.openFullScreen();
        Hancock hancock = new Hancock("Action Movie","Peter Berg","Hancock","14.09.2009","150M $", "Columbia Pictures");
        hancock.runFilm();
        hancock.closeFilm();
        hancock.openFullScreen();
        Kickboxer kickboxer = new Kickboxer("Action Movie","Mark Disalle, David Worth","Kickboxer","1989","2.7M $","Kings Road Entertainment");
        kickboxer.runFilm();
        kickboxer.closeFilm();
        kickboxer.openFullScreen();


        System.out.println("Second task");
        titanfall.delete();
        titanfall.instalGame(titanfall.delete());

        System.out.println("\n");
        kickboxer.pause();
        kickboxer.soundOff();
        kickboxer.soundOn(kickboxer.soundOff());
    }
}
