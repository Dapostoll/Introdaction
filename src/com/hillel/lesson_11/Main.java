package com.hillel.lesson_11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {


    public static void main(String[] args) throws IOException{

        Zoo giraffe = new Zoo("giraffe");
        Zoo crocodile = new Zoo("crocodile");
        Zoo tiger = new Zoo("tiger");
        Zoo hippopotamus = new Zoo("hippopotamus");
        Zoo wolf = new Zoo("wolf");
        Zoo penguin = new Zoo("penguin");
        PetShop parrot = new PetShop("parrot");
        PetShop hamster = new PetShop("hamster");
        PetShop rat = new PetShop("rat");
        Shelter dog = new Shelter("dog");
        Shelter cat = new Shelter("cat");
        Shelter dove = new Shelter("dove");


        LinkedList linkedList = new LinkedList();
        linkedList.add(giraffe);
        linkedList.add(crocodile);
        linkedList.add(tiger);
        linkedList.add(hippopotamus);
        linkedList.add(wolf);
        linkedList.add(penguin);
        System.out.println(linkedList.size());
        System.out.println(linkedList);
        linkedList.addFirst(parrot);
        linkedList.addFirst(hamster);
        linkedList.addFirst(rat);
        System.out.println(linkedList.size());
        System.out.println(linkedList);
        linkedList.set(6,dog);
        linkedList.set(7,cat);
        linkedList.set(8,dove);
        System.out.println(linkedList.size());
        System.out.println(linkedList);

        ArrayList zooList = new ArrayList();
        zooList.add(giraffe);
        zooList.add(crocodile);
        zooList.add(tiger);
        zooList.add(hippopotamus);
        zooList.add(wolf);
        zooList.add(penguin);
        ArrayList petshopList = new ArrayList();
        petshopList.add(parrot);
        petshopList.add(hamster);
        petshopList.add(rat);
        ArrayList shelterList = new ArrayList();
        shelterList.add(dog);
        shelterList.add(cat);
        shelterList.add(dove);





    }
    public void checkList(LinkedList linkedList) {
        System.out.println(linkedList);
        int linkedsize = linkedList.size();
//        int petshopSize = petshopList.size();
//        int shelterSize = shelterList.size();
//
//        while (zooSize < 2) {
//            zooList.removeAll(zooList);
//            zooList.add(giraffe);
//            zooList.add(crocodile);
//        }
//        while (petshopSize < 2) {
//            petshopList.removeAll(petshopList);
//            petshopList.add(parrot);
//            petshopList.add(hamster);
//        }
//        while (shelterSize < 2) {
//            shelterList.removeAll(shelterList);
//            shelterList.add(dog);
//            shelterList.add(cat);
//        }


        int size = linkedList.size();
//        while (size < 6) {
//            linkedList.removeAll(linkedList);
//            linkedList.addAll(zooList);
//            linkedList.addAll(petshopList);
//            linkedList.addAll(shelterList);
//        }

    }


}
