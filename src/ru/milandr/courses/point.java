package ru.milandr.courses;

public class point {

    private double x;
    private double y;

    public point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getDistance(point a){
        return Math.sqrt((this.x - a.x) * (this.x - a.x) + (this.y - a.y) * (this.y - a.y));
    }
}
