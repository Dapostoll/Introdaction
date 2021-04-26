package com.hillel.lesson_13.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SecondClassForSecondTask extends FirstClassForSecondTask {
    public SecondClassForSecondTask(List list, Set set, Map map) {
        super(list, set, map);
    }

    public void method1(List list, List list1) {
        List<? extends FirstClassForSecondTask> myList1 = new ArrayList<>(list);
        List<? super TheThirdClassForSecondTask> myList2 = new ArrayList<>(list1);

        System.out.println(myList1.toString());
        System.out.println(myList2.toString());
    }

}
