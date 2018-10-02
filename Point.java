package ru.milandr.courses.dmitrieva;

public class Point {
    private double x;
    private double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

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

    public double getDistance(Point a) {
        return  Math.sqrt(Math.pow(this.x-a.x, 2)+Math.pow(this.y-a.y, 2));
    }

    public static String getLine(Point a, Point b) {
        if (a.x == b.x && a.y == b.y) {
            return "Invalid points";
        }
        if (a.x == b.x) {
            return String.format("x = %.1f", a.x);
        }
        double k = 0;
        k =  ((a.y - b.y)/(a.x - b.x));
        double p = 0;
        p =  (a.y - k*a.x);
        if ( p == 0) {
            return String.format("y = %.1f*x", k);
        }
        return String.format("y = %.1f *x + %.1f", k, p);
    }

    public Point getMiddle(Point a) {
        if (a.x == this.x && a.y == this.y) {
            System.out.println("Invalid point");
            return a;
        }
        Point middle = new Point(0,0);
        middle.x = ((a.x + this.x)/2);
        middle.y = ((a.y + this.y)/2);
        return middle;
    }

    public String getCircle(Point a) {
        if (a.x == this.x && a.y == this.y) {
            return "Invalid points";
        }
        Point center = getMiddle(a);
        double r;
        r = getDistance(a)/2;
        return String.format("(x-%.1f)^2+(y-%.1f)^2=%.1f", center.x, center.y, Math.pow(r,2));
    }


}
