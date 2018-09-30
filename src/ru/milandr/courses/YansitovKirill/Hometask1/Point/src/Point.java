import java.util.Formatter;

public class Point
{
    protected double x, y;

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Point()
    {
        this.x = 0;
        this.y = 0;
    };

    public double getX(){return x;}
    public void setX(double x){this.x = x;}
    public double getY(){return y;}
    public void setY(double y){this.y = y;}

    double getDistance(Point fi, Point se)
    {
        return Math.sqrt((fi.x - se.x)*(fi.x - se.x) + (fi.y - se.y)*(fi.y - se.y));
    }

    void getLine(Point fi, Point se)
    {
        Formatter f = new Formatter();


        if((fi.x == se.x)&&(fi.y == se.y))
        {
            f.format("Can not create line\n");
        }
        else if(fi.y == se.y)
        {
            f.format("line: y = %.2f\n", fi.y);
        }
        else if(fi.x == se.x)
        {
            f.format("line: x = %.2f\n", fi.x);
        }
        else
        {
            double k = (fi.y - se.y)/(fi.x - se.x);
            double b = fi.y - k*fi.x;
            f.format("line: y = %.2f1*x + %.2f\n", k, b);
        }

        System.out.print(f);
    }

    Point getMiddle(Point fi, Point se)
    {
        return new Point((fi.x + se.x)/2, (fi.y + se.y)/2);
    }

    void getCircle(Point fi, Point se)
    {

        Formatter f = new Formatter();
        if((fi.x == se.x)&&(fi.y == se.y))
        {
            f.format("Can not create circle\n");
        }
        else {
            Point centre = getMiddle(fi, se);
            double r = getDistance(centre, fi);
            f.format("Circle: (x - %.2f)^2 + (y - %.2f)^2 = %.2f^2\n", centre.x, centre.y, r);
        }
        System.out.print(f);
    }
}

