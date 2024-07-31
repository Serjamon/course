

public class MyProg {
    public static void main(String[] args) {

        Student st1 = new Student("Petya");
        System.out.println(st1);

        st1.addGrade(4);
        System.out.println(st1);

        int[] gr2 = {2, 3, 2, 3, 5};
        Student st2 = new Student("Vasya", gr2);
        System.out.println(st2);

        System.out.println(st2.getGrades());
        st2.addGrade(2);
        st2.addGrade(7);
        st2.addGrade(1);
        st2.addGrade(5);
        System.out.println(st2.getGrades());

    }
}
