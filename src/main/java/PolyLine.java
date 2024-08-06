import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolyLine implements Measurable {
    Point arrayOfPoints[];

    public PolyLine() {

    }

    public PolyLine(Point arr[]) {
        this.arrayOfPoints = arr;
    }

    @Override
    public String toString() {
        String res = "Линия [";

        if (arrayOfPoints == null || arrayOfPoints.length == 0) return "Линия не имеет точек";

        for (int i = 0; i < arrayOfPoints.length; i++){
            res = res + arrayOfPoints[i].toString() + ",";
        }
        res = res.substring(0, res.length()-1) + "]";
        return res;
    }

    public Line[] getLines() {
        //по условию в результате должен быть массив
        List<Line> res = new ArrayList<>();

        if (arrayOfPoints == null || arrayOfPoints.length <= 1) return res.toArray(new Line[0]);

        for (int i = 0; i < arrayOfPoints.length - 1; i++) {
            Line line = new Line(arrayOfPoints[i], arrayOfPoints[i + 1]);
            res.add(line);
        }

        return res.toArray(new Line[0]);
    }

    public double getLength(){
        double res = 0;
        Line[] linesList = this.getLines();

        if (linesList.length == 0) return res;

        for (int i = 0; i < linesList.length; i++) {
            res += linesList[i].getLength();
        }

        return res;
    }

}
