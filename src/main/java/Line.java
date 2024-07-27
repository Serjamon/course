public class Line {

    Point startCoord;
    Point endCoord;

    public Line(Point startCoord, Point endCoord) {
        this.startCoord = startCoord;
        this.endCoord = endCoord;
    }

    public Line(int x1, int y1, int x2, int y2){
        this(new Point(x1, y1), new Point(x2, y2));
    }

    @Override
    public String toString() {
        return "Линия от {"
                + startCoord.x + ";" + startCoord.y
                + "} до {"
                + endCoord.x + ";" + endCoord.y + "}";
    }

    public double getLength(){
        int xLenght = this.endCoord.x - this.startCoord.x;
        int yLenght = this.endCoord.y - this.startCoord.y;

        return Math.hypot(xLenght, yLenght);
    }

}
