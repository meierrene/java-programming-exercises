package de.renemeier.udemy.timbuchalka.exercises.exercise32.point;

public class Point {
    private int x;
    private int y;

    public Point() {
        System.out.println("No-arg constructor");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance() {
        return Math.sqrt((this.x * this.x) + (this.y * this.y));
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance(Point point) {
        return Math.sqrt((this.x - point.getX()) * (this.x - point.getX()) + (this.y - point.getY()) * (this.y - point.getY()));
    }
}