package ru.milandr.courses.vorobyev;

public class Coordinats
{
    private double x;
    private double y;

    public Coordinats(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public static double getDistance(Coordinats a, Coordinats b)
    {
        return Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
    }

    public double getDistanceFrom(Coordinats a) // same as getDistance, but works with current object
    {
        return Math.sqrt(Math.pow(this.x - a.x, 2) + Math.pow(this.y - a.y, 2));
    }

    public static String getLinearEquation(Coordinats a, Coordinats b)
    {
        if (a.x == b.x && a.y == b.y)
            return "for this method use 2 different points!!";
        if (a.x == b.x && a.y != b.y)
            return String.format("x = %.1f", a.x);
        if (a.y == b.y && a.x != b.x)
            return String.format("y = %.1f", a.y);
        double k, c, dx, dy;
        dx = a.x - b.x;
        dy = a.y - b.y;
        k = dy / dx;
        c = a.y - k * a.x;// y = kx + c
        return String.format("y = %.1fx + %.1f", k, c);
    }

    public Coordinats getMiddleCoordinatFrom(Coordinats a)
    {
        Coordinats coord = new Coordinats((this.x + a.x) / 2, (this.y + a.y) / 2);
        return coord;
    }

    public static Coordinats getMiddleCoordinat(Coordinats a, Coordinats b)
    {
        Coordinats coord = new Coordinats((b.x + a.x) / 2, (b.y + a.y) / 2);
        return coord;
    }

    public static String getCircleEquation(Coordinats a, Coordinats b)
    {
        double Rsquared = (Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2))/ 4;
        Coordinats centre = getMiddleCoordinat(a, b);
        if (centre.x == 0 && centre.y == 0)
            return String.format("x^2 + y^2 = %.1f", Rsquared);
        if (centre.x == 0)
            return String.format("x^2 + (y - %.1f)^2 = %.1f", centre.y, Rsquared);
        if (centre.y == 0)
            return String.format("(x-%.1f)^2 + y^2 = %.1f", centre.x, Rsquared);
        return String.format("(x - %.1f)^2 + (y - %.1f)^2 = %.1f", centre.x, centre.y, Rsquared);
    }

    public String getCircleEquationFrom(Coordinats a)
    {
        double Rsquared = (Math.pow(this.x - a.x, 2) + Math.pow(this.y - a.y, 2)) / 4;
        Coordinats centre = getMiddleCoordinat(a, this);
        if (centre.x == 0 && centre.y == 0)
            return String.format("x^2 + y^2 = %.1f", Rsquared);
        if (centre.x == 0)
            return String.format("x^2 + (y - %.1f)^2 = %.1f", centre.y, Rsquared);
        if (centre.y == 0)
            return String.format("(x-%.1f)^2 + y^2 = %.1f", centre.x, Rsquared);
        return String.format("(x - %.1f)^2 + (y - %.1f)^2 = %.1f", centre.x, centre.y, Rsquared);
    }
}
