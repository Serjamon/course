class Fraction extends Number {
    int num, denum;

    public Fraction(int num, int denum) {
        this.num = num;
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
        return num / denum;
    }

    @Override
    public double doubleValue() {
        return num / denum;
    }
}