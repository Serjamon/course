
public class MyProg {
    public static void main(String[] args) {

        double r1 = sumAll(new Fraction(2),
                new Fraction(3,5),
                new Fraction(2, 3,10));

        System.out.println(r1);

        double r2 = sumAll(new Fraction(3, 6,10),
                new Fraction(49,12),
                new Fraction(3),
                new Fraction(3,2));

        System.out.println(r2);

        double r3 = sumAll(new Fraction(1,3),
                new Fraction(1));

        System.out.println(r3);

    }

    public static double sumAll(Fraction... fractions){
        double res = 0;

        for (int i = 0; i < fractions.length; i++) {
            res += fractions[i].doubleValue();
        }
        return res;
    }

}
