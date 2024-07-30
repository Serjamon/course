
public class MyProg {
    public static void main(String[] args) {

        Fraction fr1 = new Fraction(1, 3);
        Fraction fr2 = new Fraction(2, 5);
        Fraction fr3 = new Fraction(7, 8);

        Fraction res = fr1.sum(fr2).sum(fr3).minus(5);
        System.out.println(res);

    }
}
