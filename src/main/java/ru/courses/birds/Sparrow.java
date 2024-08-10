package ru.courses.birds;

public class Sparrow extends Bird {

    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void sing() {
        System.out.println("чырык");
    }
}
