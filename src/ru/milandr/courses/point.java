package ru.milandr.courses;

public class point {

    private double x;
    private double y;

    private point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private double getDistance(point a) {
        return Math.sqrt((this.x - a.x) * (this.x - a.x) + (this.y - a.y) * (this.y - a.y));
    }

    private point getMiddlePoint(point a) {
        return new point((this.x + a.x) / 2, (this.y + a.y) / 2);
    }

    public String getCircle(point a) {
        point middle = this.getMiddlePoint(a);
        double RadiusSquare = (this.getDistance(a) / 2) * (this.getDistance(a) / 2);
        return String.format("Ecuation is (x - (%.2f))^2 + (y - (%.2f)^2 = %.2f)", middle.x, middle.y, RadiusSquare);
    }

    public String getLine(point a, point b) {
        if (a.x == b.x && a.y == b.y) {
            return "Choose different points";
        }
        double dx = b.x - a.x;
        double dy = b.y - a.y;
        if (dx == 0) {
            return String.format("x=%.2f", a.x);
        } else if (dy == 0) {
            return String.format("y=%.2f", a.y);
        } else {
            double k = dy / dx;
            double c = a.y - k * a.x;
            return String.format("y=%.2f * x + %.2f", k, c);
        }
    }
}
