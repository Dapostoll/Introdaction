package com.hillel.lesson_8.MyHomeWork;

public class House {
    public static void main(String[] args) {
        Chair chair = new Chair("Used", "Wooden");
        Table table = new Table("New", "Metal");
        TableTop tableTop = new TableTop("New", "Wooden");
        Cupboard cupboard = new Cupboard("Used", "Wooden");
        DoorWithFinal door = new DoorWithFinal();
        ComputerWith9 computer = new ComputerWith9("Metal", 1000,"Dell","Bloody","A4Tech","Sven","Fantech","Gigabate","AMD");
        System.out.println(chair);
        System.out.println(table);
        System.out.println(tableTop);
        System.out.println(cupboard);
        System.out.println(door);
        System.out.println(computer);

    }
}
