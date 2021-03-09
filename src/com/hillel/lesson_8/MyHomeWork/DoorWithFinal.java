package com.hillel.lesson_8.MyHomeWork;

public class DoorWithFinal {
    private final String condition;
    private final String material;
    private final String lock;
//
    // Не понял что значит по умолчанию

    public DoorWithFinal() {
        this.condition = "New";
        this.material = "Wooden";
        this.lock = "With lock";
    }

    public DoorWithFinal(String condition, String material, String lock) {
        this.condition = condition;
        this.material = material;
        this.lock = lock;
    }
// создал обьекты сразу с помощью конструктора без сеттера


    public String getCondition() {
        return condition;
    }

    public String getMaterial() {
        return material;
    }

    public String getLock() {
        return lock;
    }

    @Override
    public String toString() {
        return "DoorWithFinal{" +
                "condition='" + condition + '\'' +
                ", material='" + material + '\'' +
                ", lock='" + lock + '\'' +
                '}';
    }
}
