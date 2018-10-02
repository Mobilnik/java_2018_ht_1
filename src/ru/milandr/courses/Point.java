package ru.milandr.courses.Ozherelev;

import java.lang.Math;

public class Point {
    private double X;
    private double Y;

    Point(double x, double y)
    {
        Y = y;
        X = x;
    }

    public Point(Point A, Point B)
    {
        if ((A.GetX() == B.GetX()) && (A.GetY() == B.GetY()))
        {
            System.out.println("You have set the same points, give me other ones");
            System.exit(-1);
        }

        else
        {
            X = (A.GetX() + B.GetX()) / 2;
            Y = (A.GetY() + B.GetY()) / 2;
        }
    }

    public double Distance(Point B)
    {
        double Dist = Math.sqrt(Math.pow((this.X - B.GetX()), 2.00) + Math.pow((this.Y - B.GetY()), 2.00));
        return Dist;
    }

    public double GetY()
    {
        return Y;
    }

    public double GetX()
    {
        return X;
    }

    public void SetX(double x)
    {
        X = x;
    }

    public void SetY(double y)
    {
        Y = y;
    }


}

// line is claimed as ValX * x + ValB * y + ValC * c =0

class Line
{
    private double ValX;
    private double ValY;
    private double ValC;

    Line(Point A, Point B)
    {
        if ((A.GetX() == B.GetX()) && (A.GetY() == B.GetY()))
        {
            System.out.println("I can't make a line by using one point");
            System.exit(-2);

        }

        else if ((A.GetX() == B.GetX()) && (A.GetY() != B.GetY()))
        {
            ValX = 1;
            ValY = 0;
            ValC = -A.GetX();
        }

        else if ((A.GetX() != B.GetX()) && (A.GetY() == B.GetY()))
        {
            ValX = 0;
            ValY = 1;
            ValC = -A.GetY();
        }

        else
        {
            ValX = (A.GetY() - B.GetY()) / (A.GetX() - B.GetX());
            ValY = 1;
            ValC = A.GetY() - ValX * A.GetX();
        }
    }

    public void SetValX(double valx)
    {
        ValX = valx;
    }

    public void SetValY(double valy)
    {
        ValY = valy;
    }

    public void SetValC(double valc)
    {
        ValC = valc;
    }

    public double GetValX()
    {
        return ValX;
    }

    public double GetValY()
    {
        return ValY;
    }

    public double GetValC()
    {
        return ValC;
    }
}

class Circle
{
    private Point Center;
    private double Radius;

    Circle(Point A, Point B)
    {
        Center = new Point(A, B);
        Radius = A.Distance(B) / 2;

    }

    public void SetCenter(double x, double y)
    {
        Center.SetX(x);
        Center.SetY(y);
    }

    public Point GetCenter()
    {
        return Center;
    }

    public void SetRadius(double radius)
    {
        Radius = radius;
    }

    public double GetRadius()
    {
        return Radius;
    }
}

