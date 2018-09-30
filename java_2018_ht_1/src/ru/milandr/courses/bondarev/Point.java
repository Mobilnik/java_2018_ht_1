package ru.milandr.courses.bondarev;

class Point {
    public static double x;
    public static double y;


    public static Point setPoint(double a, double b) {
        public Point p;
        p.x = a;
        p.y = b;
        return p;
    }

    /*
    public Point(double a, double b) {
        x = a;
        y = b;
    }
    */

    public double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    public String middlePoint(Point p1, Point p2) {
        return "(" + (p1.x + p2.x) / 2 + ", " + (p1.y + p2.y) / 2 + ")";
    }

    public String lineEquation(Point p1, Point p2){
        return ("(x-" + (p1.x) + ")/(" + (p2.x) + "-" + (p1.x) + " = " + "(y-" + (p1.y) + "/(" + (p2.y) + "-" + (p1.y));
    }

    public static void main(String[] args) {
        Point p1 = setPoint(1.0, 1.0);
        Point p2 = new Point(2.0, 2.0);
        System.out.println(distance(p1, p2));
        System.out.println(middlePoint(p1, p2));
        System.out.println(lineEquation(p1, p2));
    }
}
