package ru.milandr.courses;

public class Point {
    private double x;
    private double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "{ " + getX() + ", " + getY() + ")";
    }

    public Point() {
        setX(0);
        setY(0);
    }

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    public double lenght(Point p) {
        return Math.sqrt((this.x - p.x) * (this.x - p.x)
                + (this.y - p.y) * (this.y - p.y));
    }

    public String getEquation(Point p) {
        return "( " + (p.getY() - getY()) + ")x + ("
                +  (getX() - p.getX()) + ") y + "
                + (p.getX()*getY() - p.getY()* getX()) + " = 0";
    }

    public Point getCenter(Point p) {
        return new Point((getX() + p.getX())/2, (getY() - p.getY())/2);
    }


}
