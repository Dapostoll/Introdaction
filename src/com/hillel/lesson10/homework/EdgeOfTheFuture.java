package com.hillel.lesson10.homework;

import com.hillel.lesson10.homework.ActionMovie;

final public class EdgeOfTheFuture extends ActionMovie {

    private String budget;
    private String filmCompany;

    public EdgeOfTheFuture(String mainGenre, String producer, String filmName, String dateOfIssue, String budget, String filmCompany) {
        super(mainGenre, producer, filmName, dateOfIssue);
        this.budget = budget;
        this.filmCompany = filmCompany;
    }


    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getFilmCompany() {
        return filmCompany;
    }

    public void setFilmCompany(String filmCompany) {
        this.filmCompany = filmCompany;
    }
    public void openFullScreen(){
        System.out.println(getFilmName() + " is opening in fullscreen \nFullscreen is open\n");
    }

    @Override
    public void closeFilm() {
        System.out.println(getFilmName() + " is closing \n" + getFilmName() + " is closed\n");
    }

    @Override
    public void runFilm() {
        System.out.println(getFilmName() + " is launched \n" + getFilmName() + " is started\n");
    }

    @Override
    public String toString() {
        return "EdgeOfTheFuture{" +
                "budget='" + budget + '\'' +
                ", filmCompany='" + filmCompany + '\'' +
                '}';
    }
}

