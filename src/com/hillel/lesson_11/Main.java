package com.hillel.lesson_11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {


        List linkedList = new ArrayList();
        zoo(linkedList);
        petshop(linkedList);
    }

    public static List zoo(List linkedList) {

        if (linkedList.isEmpty()) {
            for (int i = 0; i < 6; i++) {
                linkedList.add(new Zoo());
            }
            System.out.println(linkedList.size());
            System.out.println(linkedList);
            for (int i = 0; i < 3; i++) {
                linkedList.add(i, new PetShop());
            }
            for (int i = linkedList.size() - 1; i > linkedList.size() - 4; i--) {
                linkedList.set(i, new Shelter());
            }

            System.out.println(linkedList.toString());

        }
        return linkedList;
    }


    public static List petshop(List linkedList) {

        int a = 0;
        int b = 0;
        int c = 0;

        Iterator iterator = linkedList.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().equals(new Zoo()) && a < 2) {
                a++;
            }
            if (iterator.next().equals(new PetShop()) && b < 2) {
                b++;
            }
            if (iterator.next().equals(new Shelter()) && c < 2) {
                c++;
            } else {
                iterator.remove();

            }
        }
        System.out.println(linkedList.toString());
        return linkedList;
    }
}
