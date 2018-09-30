package ru.milandr.courses.Perepelitsyn;

public class Tochka {
    private double x;
    private double y;

    public Tochka(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }

    public double getL(Tochka A) {
        double L = Math.sqrt((this.x - A.x)*(this.x - A.x)+(this.y - A.y)*(this.y - A.y));
        return L;
    }

    public Tochka getM(Tochka A) {
        Tochka M = new Tochka((A.x + this.x)/2, (A.y + this.y/2));
        return M;
    }

    public String getLine(Tochka A) {
        double a = (this.y - A.y) / (this.x - A.x);
        double b = this.y - a * this.x;
        if (b > 0) {
            return String.format("y = %.2f * x + %.2f\n", a, b);
        }
        else if (b < 0)
            return String.format("y = %.2f * x - %.2f\n", a, Math.abs(b));
        else
            return String.format("y = %.2f * x\n", a);
    }
    public String getR(Tochka A) {
        Tochka O = this.getM(A);
        double R = O.getL(A);
        if (O.x == 0 && O.y != 0)
            return String.format("x ^ 2 + (y - %.2f) ^ 2 = %.2f", O.y, Math.pow(R, 2));
        else if (O.x != 0 && O.y == 0)
            return String.format("(x - %.2f) ^ 2 + y ^ 2 = %.2f", O.x, Math.pow(R, 2));
        else
            return String.format("x ^ 2 + y ^ 2 = %.2f", Math.pow(R, 2));
    }
}
