package com.hillel.lesson_8.MyHomeWork;

public class Cupboard {
    private String condition;
    private String material;

    public Cupboard(String condition, String material) {
        this.condition = condition;
        this.material = material;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Сupboard{" +
                "condition='" + condition + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
