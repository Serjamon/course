package ru.courses.main;


import ru.courses.organization.Department;
import ru.courses.organization.Employee;

public class MyProg {

    public static void main(String[] args) {

        Department dept1 = new Department("Cleaning");
        Department dept2 = new Department("Cooking");
        Employee empl1 = new Employee("Petya", dept1);
        Employee empl2 = new Employee("Vasya", dept2);

        System.out.println(empl1);
        dept1.setBoss(empl1);
        System.out.println(empl1);
        dept2.setBoss(empl1);

    }

}
