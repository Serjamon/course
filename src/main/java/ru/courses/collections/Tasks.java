package ru.courses.collections;

import java.util.ArrayList;
import java.util.List;

public class Tasks {
    public static void main(String[] args) {
        int n = 10;
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) list.add(i);

        for (int i = 0; i < list.size() - 1; i += 2) {
            int tmp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, tmp);
        }

        System.out.println(list);
    }
}
