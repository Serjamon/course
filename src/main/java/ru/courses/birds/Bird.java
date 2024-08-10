package ru.courses.birds;

public abstract class Bird implements Singable{

    public String name;

    public Bird(String name) {
        this.name = name;
    }

    public abstract void sing();

}
