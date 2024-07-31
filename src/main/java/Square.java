public class Square {

    int x, y;
    private int sideLength;

    public Square(int x, int y, int sideLength) {
        this.x = x;
        this.y = y;
        setSideLength(sideLength);
    }

    public void setSideLength(int sideLength) {
        if (sideLength > 0) this.sideLength = sideLength;
        else throw new IllegalArgumentException("must be > 0");
    }

    @Override
    public String toString() {
        return "Квадрат в точке {" +
                x + ";" + y +
                "} со стороной " + sideLength;
    }
}
