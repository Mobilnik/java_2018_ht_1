package ru.milandr.courses;


public class Application {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Point a = new Point();
        Point b = new Point(-3, -4);




        System.out.println(new Point(4, 5).getY() + "\n");
        System.out.println(a + "\n" + b);
        System.out.println(a.lenght(b));
    }
}
