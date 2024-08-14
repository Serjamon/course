package ru.courses.objects;

import java.util.Objects;

class Line implements Cloneable{
    Point start,end;
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return start.equals(line.start) && end.equals(line.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    protected Line clone() throws CloneNotSupportedException {
        return new Line(this.start.clone(), this.end.clone());
    }
}