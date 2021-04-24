package com.hillel.lesson_11;

public class PetShop {



    private String name;
    public PetShop(String name) {
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
        return "PetShop{" +
                "name='" + name + '\'' +
                '}';
    }


    public void eat(){}
}

