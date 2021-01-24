package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        evenOdd();
    }
//
    static void evenOdd(){
        String[] names = {"Teboho", "Thabo"};
        List<String> list = Arrays.asList(names); // Using asList() method to convert array to arrayList
        System.out.println(list);

        List<String> strings = new ArrayList<>(Arrays.asList(names)); // compact way of using asList() method
        System.out.println(strings);

        List<String> list1 = Collections.unmodifiableList(list); // Using collection to convert array to arrayList
        System.out.println(list1);


        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> stringList = new ArrayList<>(); // Both string and/or integer array can be
        for (int number:numbers)
            stringList.add(number);
        System.out.println(stringList);
    }
}
