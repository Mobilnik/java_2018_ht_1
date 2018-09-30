package ru.milandr.courses.filippova;

import static java.lang.Math.abs;

import java.lang.ArithmeticException;

public class Point
{
    private   double   x;
    private   double  y;

    public Point(double x1, double y1)
    {
        this.x = x1;
        this.y = y1;
    }

    public  double  getX()
    {
        return x;
    }

    public  double  getY() {
        return y;
    }

    public void setX( double  x1)
    {
        this.x = x1;
    }
    public void setY( double  y1)
    {
        this.y = y1;
    }
    public static double getDistance(Point FirstPoint, Point SecondPoint)
    {
        return Math.sqrt((Math.pow((FirstPoint.x-SecondPoint.x),2) + Math.pow((FirstPoint.y-SecondPoint.y),2)));
    }

    public static Point getMiddle  (Point FirstPoint , Point SecondPoint)
    {
        Point Middle = new Point (abs(FirstPoint.x - SecondPoint.x)/2.0, abs(FirstPoint.y - SecondPoint.y)/2.0);
        return (Middle);

    }
    public static void getLine(Point FirstPoint,Point SecondPoint)
    {
        double k = 0;
        double b = 0;
        b = FirstPoint.y - k * FirstPoint.x;
        k = (FirstPoint.y - SecondPoint.y) / (FirstPoint.x - SecondPoint.x);
        try
        {
            if ((FirstPoint.x - SecondPoint.x) == 0)
            {
                throw new ArithmeticException();
            }
        }
        catch (ArithmeticException ae)
        {
            System.out.println("x = " + FirstPoint.x);
        }
        try
        {
            if ((FirstPoint.y- SecondPoint.y) == 0)
            {
                throw new ArithmeticException();
            }

        }
        catch (ArithmeticException ae)
        {
            System.out.println("y = " + FirstPoint.y);
        }
        if ((FirstPoint.x - SecondPoint.x) != 0 && (FirstPoint.y - SecondPoint.y) != 0)
        {
            System.out.println("y = " + k + "x" + "+" + b);
        }



    }
    public static void  getCircle (Point FirstPoint , Point SecondPoint)
    {

        double d = getDistance(FirstPoint, SecondPoint);
        double D = Math.pow(d/2, 2);
        try
        {
            if (d == 0)
            {
                throw new ArithmeticException();
            }
            if (d != 0)
            {
                System.out.println("x^2" + "+" + "y^2" + "=" + D);
            }
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Can't make a circle");
        }


    }
}