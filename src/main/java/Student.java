import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String name;
    private List<Integer> grades;


    private Student(String name, List<Integer> grades) {
        this.name = name;
        //if (!grades.isEmpty()) {this.grades = grades;}
        this.grades = checkGrades(grades);
    }

    public static Student ofName(String name) {
        return new Student(name, new ArrayList<>());
    }

    public static Student ofNameAndGrades(String name, int[] grades) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < grades.length; i++) {
            lst.add(grades[i]);
        }
        return new Student(name, lst);
    }

    private static List<Integer> checkGrades(List<Integer> grades) {
        //вот это нагуглил, удобная штука
        //https://stackoverflow.com/questions/14231688/how-to-remove-element-from-arraylist-by-checking-its-value
        grades.removeIf(integer -> integer > 5 || integer < 2);
        return grades;
    }

    @Override
    public String toString() {
        return name + ": " + (grades.isEmpty() ? "[]" : grades);
    }

    public String getGrades() {
        return grades.toString();//это новый объект
    }

    public void addGrade(int gr) {
        if (gr > 1 && gr < 6) grades.add(gr);
        else {
            System.out.println("Оценка должна быть в диапазоне 2-5, передано " + gr);
        }
    }
}
