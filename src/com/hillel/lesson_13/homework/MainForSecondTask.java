package com.hillel.lesson_13.homework;

import java.util.*;

public class MainForSecondTask {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        List list2 = new ArrayList();

        List list = new ArrayList();
        Set set = new TreeSet();
        Map map = new LinkedHashMap();

        SecondClassForSecondTask obj = new SecondClassForSecondTask(list,set,map);

        list1.add("a");
        list1.add("b");
        list1.add("c");

        list2.add("d");
        list2.add("f");
        list2.add("l");

        System.out.println(list1.toString());
        System.out.println(list2.toString());

        obj.method1(list1,list2);

    }
}
