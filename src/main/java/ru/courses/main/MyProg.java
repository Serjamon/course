package ru.courses.main;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;


public class MyProg {
    public static void main(String[] args) {

        System.out.println(myPow(args));

    }

    public static double myPow(String... x) {

        if (x.length != 2) return 0;

        double intX = parseInt(x[0]);
        double intY = parseInt(x[1]);

        return pow(intX, intY);

    }


}
