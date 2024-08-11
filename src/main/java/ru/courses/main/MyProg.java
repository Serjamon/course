package ru.courses.main;


import ru.courses.geometry.Point;
import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;


public class MyProg {

    public static void main(String[] args) {

        Point innerPoint = new Point(2,3);
        System.out.println(innerPoint);

        java.awt.Point pointAWT = new java.awt.Point(3, 5);
        System.out.println(pointAWT);




    }

    public static double myPow(String... x) {

        if (x.length != 2) return 0;

        double intX = parseInt(x[0]);
        double intY = parseInt(x[1]);

        return pow(intX, intY);

    }


}
