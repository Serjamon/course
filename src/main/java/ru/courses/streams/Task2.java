package ru.courses.streams;

import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        printList(list);
    }

    public static void printList(ArrayList<Integer> list) {
        list.forEach(item -> System.out.println(item));
    }

}
