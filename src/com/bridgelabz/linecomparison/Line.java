package com.bridgelabz.linecomparison;

import java.util.Objects;

public class Line implements Comparable<Line> {
    Point p1;
    Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double calculateLength() {
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }

    @Override
    public int compareTo(Line otherLine) {
        // Compare lines based on their lengths
        Double length1 = this.calculateLength();
        Double length2 = otherLine.calculateLength();
        return length1.compareTo(length2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line otherLine = (Line) obj;
        return Objects.equals(p1, otherLine.p1) && Objects.equals(p2, otherLine.p2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(p1, p2);
    }
}
