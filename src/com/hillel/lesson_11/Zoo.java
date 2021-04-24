package com.hillel.lesson_11;

public class Zoo {
   private String name;

    public Zoo(String name) {
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
        return "Zoo{" +
                "name='" + name + '\'' +
                '}';
    }
    public void ReleaseToFreedom(){}
}
