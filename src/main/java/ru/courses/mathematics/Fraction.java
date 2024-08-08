package ru.courses.mathematics;

class Fraction extends Number {
    int num, denum;

    public Fraction(int num, int denum) {
        this.num = num;
        this.denum = denum;
    }

    public Fraction(int num) {
        this.num = num;
        this.denum = 1;
    }

    public Fraction(int whole, int num, int denum) {
        this.num = (whole * denum) + num;
        this.denum = denum;
    }

    public String toString() {
        return num + "/" + denum;
    }


    @Override
    public int intValue() {
        return num / denum;
    }

    @Override
    public long longValue() {
        return num / denum;
    }

    @Override
    public float floatValue() {
        return (float) num / denum;
    }

    @Override
    public double doubleValue() {
        return (double) num / denum;
    }
}