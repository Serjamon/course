package ru.courses.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tasks {
    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1, 0));
        reverse(intList);

        int[] intArr = new int[]{5, 4, 3, 2, 1, 0};
        reverse(intArr);

    }

    public static void reverse(int[] intArray) {
        int n = intArray.length - 1;

        for (int i = 0; i < intArray.length / 2; i++) {

            int temp = intArray[i];
            intArray[i] = intArray[n - i];
            intArray[n - i] = temp;

        }

    }

    public static void reverse(ArrayList<Integer> intList) {

        Collections.reverse(intList);

        System.out.println(intList);

    }
}


