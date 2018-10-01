package ru.milandr.courses.bondarev;

class Point {
    public static double x;
    public static double y;


    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public static double getX() {
        return x;
    }

    public static void setX(double x) {
        Point.x = x;
    }

    public static double getY() {
        return y;
    }

    public static void setY(double y) {
        Point.y = y;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }

    public Point middlePoint(Point p) {
        Point middle = new Point (0, 0);

        middle.x = (p.x + this.x) / 2;
        middle.y = (p.y + this.y) / 2;

        return middle;
    }



    public String lineEquation(Point p1, Point p2){
        return ("(x-" + (p1.x) + ")/(" + (p2.x) + "-" + (p1.x) + " = " + "(y-" + (p1.y) + "/(" + (p2.y) + "-" + (p1.y));
    }


    public String circleEquation (Point p)
    {
        Point Center = this.middlePoint(p);
        double radius = this.distance(p) / 2;

        return String.format("(x - %.2f)^2 + (y - %.2f)^2 = %.2f", Center.getX(), Center.getY(), radius);
    }

}
