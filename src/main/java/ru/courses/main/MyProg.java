package ru.courses.main;

import ru.courses.objects.Fraction;

public class MyProg {

    public static void main(String[] args) {

        Fraction fr2;
        Fraction fr1 = new Fraction(3, 5);
        try {
            fr2 = fr1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(fr1==fr2);

    }

}
