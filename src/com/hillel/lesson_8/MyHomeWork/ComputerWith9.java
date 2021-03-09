package com.hillel.lesson_8.MyHomeWork;

public class ComputerWith9 {
    // Я знаю что это не совсем мебель, но сложно мне придумать мебель с 9 переменными...
    private String corps;
    private int sparePartsCost;
    private String monitor;
    private String keyboard;
    private String mouse;
    private String speakers;
    private String headphones;
    private String motherboard;
    private String graphicsСard;


    public String getCorps() {
        return corps;
    }

    public void setCorps(String corps) {
        this.corps = corps;
    }

    public int getSparePartsCost() {
        return sparePartsCost;
    }

    public void setSparePartsCost(int sparePartsCost) {
        sparePartsCost = sparePartsCost;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getSpeakers() {
        return speakers;
    }

    public void setSpeakers(String speakers) {
        this.speakers = speakers;
    }

    public String getHeadphones() {
        return headphones;
    }

    public void setHeadphones(String headphones) {
        this.headphones = headphones;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public String getGraphicsСard() {
        return graphicsСard;
    }

    public void setGraphicsСard(String graphicsСard) {
        this.graphicsСard = graphicsСard;
    }

    public ComputerWith9(String corps) {
        this.corps = corps;
    }
    public ComputerWith9(String corps, int sparePartsCost){
        this.corps = corps;
        this.sparePartsCost = sparePartsCost;

    }
    public ComputerWith9(String corps, int sparePartsCost, String monitor){
        this.corps = corps;
        this.sparePartsCost = sparePartsCost;
        this.monitor = monitor;
    }
    public ComputerWith9(String corps, int sparePartsCost, String monitor, String keyboard){
        this.corps = corps;
        this.sparePartsCost = sparePartsCost;
        this.monitor = monitor;
        this.keyboard = keyboard;

    }
    public ComputerWith9(String corps, int sparePartsCost,String monitor, String keyboard, String mouse){
        this.corps = corps;
        this.sparePartsCost = sparePartsCost;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public ComputerWith9(String corps, int sparePartsCost,String monitor, String keyboard, String mouse, String speakers){
        this.corps = corps;
        this.sparePartsCost = sparePartsCost;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.speakers = speakers;
    }
    public ComputerWith9(String corps, int sparePartsCost,String monitor, String keyboard, String mouse, String speakers,String headphones){
        this.corps = corps;
        this.sparePartsCost = sparePartsCost;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.speakers = speakers;
        this.headphones = headphones;
    }
    public ComputerWith9(String corps, int sparePartsCost,String monitor, String keyboard, String mouse, String speakers,String headphones,String motherboard){
        this.corps = corps;
        this.sparePartsCost = sparePartsCost;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.speakers = speakers;
        this.headphones = headphones;
        this.motherboard = motherboard;
    }

    public ComputerWith9(String corps, int sparePartsCost,String monitor, String keyboard, String mouse, String speakers,String headphones,String motherboard,String graphicsСard){
        this.corps = corps;
        this.sparePartsCost = sparePartsCost;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.speakers = speakers;
        this.headphones = headphones;
        this.motherboard = motherboard;
        this.graphicsСard = graphicsСard;
    }

    @Override
    public String toString() {
        return "ComputerWith9{" +
                "corps='" + corps + '\'' +
                ", sparePartsCost=" + sparePartsCost +
                ", monitor='" + monitor + '\'' +
                ", keyboard='" + keyboard + '\'' +
                ", mouse='" + mouse + '\'' +
                ", speakers='" + speakers + '\'' +
                ", headphones='" + headphones + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", graphicsСard='" + graphicsСard + '\'' +
                '}';
    }
}
