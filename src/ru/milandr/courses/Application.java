package ru.milandr.courses;

import ru.milandr.courses.filippova.Dog;
import ru.milandr.courses.filippova.Point;



public class Application
{
    public static void main(String[] args)

    {
        Dog dog = new Dog("Honey pie", "brown", 30, 20, 50);
        System.out.println(Dog.getVolume(dog));
        Point PointFirst = new Point(4, 6);
        Point PointSecond = new Point(6, 6);
        Point.getLine(PointFirst, PointSecond);
        System.out.println(Point.getDistance(PointFirst, PointSecond));
        Point.getCircle(PointFirst, PointSecond);
    }
}
