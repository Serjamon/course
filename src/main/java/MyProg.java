

public class MyProg {
    public static void main(String[] args) {

//        Fraction fr1 = new Fraction(1, 3);
//        Fraction fr2 = new Fraction(2, 5);
//        Fraction fr3 = new Fraction(7, 8);
//
//        Fraction res = fr1.sum(fr2).sum(fr3).minus(5);
//        System.out.println(res);

        Student st1 = Student.ofName("Petya");
        System.out.println(st1);

        int[] gr2 = {2, 3, 2, 6, 77, 3, 5, 1, 0, 15, 3};
        Student st2 = Student.ofNameAndGrades("Petya", gr2);
        System.out.println(st2);

        System.out.println(st2.getGrades());
        st2.addGrade(2);
        st2.addGrade(7);
        st2.addGrade(1);
        st2.addGrade(5);
        System.out.println(st2.getGrades());

    }
}
