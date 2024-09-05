package ru.courses.reflection;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Dog {

    private static String poroda = "Dvornyaga"; // порода
    public String name;
    private int age;
    private List friendsName = new ArrayList<>();
    private boolean isBiting;
    private final String favoriteToy = "ball";

    public Dog(String name, int age, List friendsName) {
        this.name = name;
        this.age = age;
        this.friendsName = friendsName;
        this.isBiting = false;
    }


}
