package ru.courses.enums;

public enum ESharpness {
    VERYHOT("очень острый"),
    HOT("острый"),
    NOTHOT("не острый");

    private String str;

    ESharpness(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
}
