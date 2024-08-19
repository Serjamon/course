package ru.courses.main;

import ru.courses.enums.ESharpness;
import ru.courses.enums.Sauce;

public class MyProg {

    public static void main(String[] args) {

        Sauce s1 = new Sauce("Чили", ESharpness.VERYHOT);
        Sauce s2 = new Sauce("Кепчук", ESharpness.HOT);
        Sauce s3 = new Sauce("Мазик", ESharpness.NOTHOT);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }

}
