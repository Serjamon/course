package ru.courses.main;

import ru.courses.objects.*;

public class MyProg {

    public static void main(String[] args) {

        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 3);
        Point p3 = new Point(3, 4);
        Point p4 = new Point(4, 5);

        Point[] pArray1 = {p1,p2,p3,p4};
        Point[] pArray2 = {p1,p2,p3};
        Point[] pArray3 = {p1,p2,p4};

        PolyLine pl1 = new PolyLine(pArray1);
        PolyLine plEq = new PolyLine(pArray1);
        PolyLine plNotEq = new PolyLine(pArray2);

        System.out.println(pl1.equals(plEq));
        System.out.println(pl1.equals(plNotEq));
        System.out.println(plNotEq.equals(plEq));


    }

}
