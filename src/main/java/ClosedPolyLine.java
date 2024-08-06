public class ClosedPolyLine extends PolyLine{

    public ClosedPolyLine(Point[] arr) {
        super(arr);
    }

    @Override
    public double getLength() {

        double res = super.getLength();
        Line[] linesList = super.getLines();

        Point firstPoint = linesList[0].startCoord;
        Point lastPoint = linesList[linesList.length - 1].endCoord;

        res += new Line(lastPoint, firstPoint).getLength();

        return res;
    }
}
