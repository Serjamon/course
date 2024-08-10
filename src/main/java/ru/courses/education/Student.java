package ru.courses.education;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private List<Integer> grades; //лист использован просто для удобства добавления элементов

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = checkGrades(grades);
    }

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    private static List<Integer> checkGrades(int[] grades) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > 1 && grades[i] < 6) lst.add(grades[i]);
            else throw new IllegalArgumentException("Grade must be in range 2-5!");
        }
        return lst;
    }

    @Override
    public String toString() {
        return name + ": " + (grades.isEmpty() ? "[]" : grades);
    }

    public String getGrades() {
        return grades.toString();//это новый объект
    }

    public void addGrade(int gr) {
        if (gr > 1 && gr < 6) grades.add(gr);
        else {
            System.out.println("Оценка должна быть в диапазоне 2-5, передано " + gr);
        }
    }
}
