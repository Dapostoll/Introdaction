package com.hillel.lesson_11;

public class Shelter {

    private String name;

    public Shelter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shelter{" +
                "name='" + name + '\'' +
                '}';
    }


    public void FoundTheOwner(){}

}
