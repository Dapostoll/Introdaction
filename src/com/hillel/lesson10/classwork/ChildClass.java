package com.hillel.lesson10.classwork;

public class ChildClass extends ParentClass {

    public ChildClass(String parentName) {
        super(parentName);
    }

    @Override
    public void printSomethingToConsole() {
        System.out.println("this is child class");
    }
}
