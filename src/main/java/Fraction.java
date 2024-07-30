public class Fraction {
    private int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        setDenominator(denominator);
    }

    private void setDenominator(int num){
        if(num < 0) throw new IllegalArgumentException("must be > 0");
        this.denominator = num;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction sum(Fraction fr){
        return new Fraction((numerator * fr.denominator) +
                (fr.numerator * denominator),
                (denominator * fr.denominator));
    }

    public Fraction sum(int x){
        return new Fraction((x * denominator + numerator), (denominator));
    }

    public Fraction minus(Fraction fr){
        return new Fraction((numerator * fr.denominator) -
                (fr.numerator * denominator),
                (denominator * fr.denominator));
    }

    public Fraction minus(int x){
        return new Fraction((numerator - x * denominator), (denominator));
    }

}
