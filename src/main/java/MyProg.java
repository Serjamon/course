import java.util.List;

public class MyProg {
    public static void main(String[] args) {

        Point p1 = new Point(1, 5);
        Point p2 = new Point(2, 8);
        Point p3 = new Point(5, 3);
        Point p4 = new Point(8, 9);
        Point arr[] = {p1, p2, p3, p4};
        PolyLine normLine = new PolyLine(arr);
        double normLineLenght = normLine.getLength();//15.70
        System.out.println("Длина ломанной линии: " + normLineLenght);

        Line l2 = new Line(8, 9, 1, 5);
        System.out.println(l2.getLength());//8.06

        PolyLine closedPoly = new ClosedPolyLine(arr);
        System.out.println(closedPoly.getLength());//23.76


    }
}
