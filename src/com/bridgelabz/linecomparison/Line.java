package com.bridgelabz.linecomparison;

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
    public int compareTo(Line other) {
        //current line
        Double length1 = this.calculateLength();
        //other line which is passed as the parameter
        Double length2 = other.calculateLength();
        return length1.compareTo(length2);

    }

    public boolean equals(Line other) {
        return this == other;
    }
}