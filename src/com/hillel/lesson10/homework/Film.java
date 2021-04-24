package com.hillel.lesson10.homework;

public abstract class Film implements SoundOffButton,SoundOnButton,FilmPause {

    private String mainGenre;
    private String producer;

    public Film(String mainGenre, String producer) {
        this.mainGenre = mainGenre;
        this.producer = producer;
    }

    public String getMainGenre() {
        return mainGenre;
    }

    public void setMainGenre(String mainGenre) {
        this.mainGenre = mainGenre;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    public abstract void runFilm();
}
