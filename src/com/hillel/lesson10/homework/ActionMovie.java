package com.hillel.lesson10.homework;

import com.hillel.lesson10.homework.Film;

public abstract class ActionMovie extends Film implements SoundOffButton,SoundOnButton,FilmPause {

    private String filmName;
    private String dateOfIssue;

    public ActionMovie(String mainGenre, String producer, String filmName, String dateOfIssue) {
        super(mainGenre, producer);
        this.filmName = filmName;
        this.dateOfIssue = dateOfIssue;


    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }
    public abstract void closeFilm();
}
