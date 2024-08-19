package ru.courses.enums;

public class Sauce {

    String sauceName;
    ESharpness shrp;

    public Sauce(String sauceName, ESharpness shrp) {
        this.sauceName = sauceName;
        this.shrp = shrp;
    }

    @Override
    public String toString() {
        return "Соус " + sauceName + ": " + shrp;
    }
}

