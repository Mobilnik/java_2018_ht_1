package ru.milandr.courses.Vladislav_Beliavskiy;

public class Points {

    protected double x;
    protected double y;

    public Points (double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void setX (double x)
    {
        this.x = x;
    }

    public void setY (double y)
    {
        this.y = y;
    }

    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
    }

    public double getLenght (Points a)
    {
        return Math.sqrt((a.x - this.x) * (a.x - this.x)  + (a.y - this.y) * (a.y - this.y));
    }

    public Points getCenter (Points a)
    {
        Points center = new Points (0 , 0);
        center.x = (a.x + this.x) / 2;
        center.y = (a.y + this.y) / 2;
        return center;
    }

    public String getRound (Points a)
    {
        Points Center = this.getCenter(a);
        double radius = this.getLenght(a) / 2;
        return String.format("(x - %.2f)^2 + (y - %.2f)^2 = %.2f", Center.getX(), Center.getY(), radius);
    }

    public void getLinearFunction (Points a, Points b)
    {
        if (Math.abs(a.x - b.x) < 0 && Math.abs(a.y - b.y) < 0)
        {
            System.out.printf ("You enter two same points\n");
            return;
        }
        if (Math.abs(a.x - b.x) < 0 && Math.abs(a.y - b.y) > 0)
        {
            System.out.printf ("Your line is: x = %.2f\n", a.x);
            return;
        }

        double k = 0, c = 0;
        k = (a.y - b.y) / (a.x - b.x);
        c = a.y - k * a.x;

        if (Math.abs(k) < 0)
        {
            System.out.printf ("Your line is: y = %.2f\n", c);
        }
        else{
            if (Math.abs(c) <= 0)
                System.out.printf("Your line is: y = %.2fx\n", k);
            else if (c < 0)
                System.out.printf("Your line is: y = %.2fx + %.2f\n", k, c);
            else
                System.out.printf("Your line is: y = %.2fx + %.2f\n", k, c);
        }

    }



}



