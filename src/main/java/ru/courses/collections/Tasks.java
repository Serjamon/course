package ru.courses.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tasks {
    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(3, 2, 6, 5, 4, 1));
        bubbleSort(intList);

        int[] intArr = new int[]{9, 2, 8, 5, 4, 1};
        bubbleSort(intArr);

    }

    public static void bubbleSort(ArrayList<Integer> intList) {

        for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = 0; j < intList.size() - i - 1; j++) {
                if (intList.get(j) > intList.get(j + 1)) {
                    int temp = intList.get(j);
                    intList.set(j, intList.get(j + 1));
                    intList.set(j + 1, temp);
                }
            }
        }
        System.out.println(intList);
    }

    public static void bubbleSort(int[] intArray) {

        ArrayList<Integer> intList = new ArrayList<>();

        for (int i = 0; i < intArray.length; i++) intList.add(intArray[i]);

        bubbleSort(intList);

    }


}
