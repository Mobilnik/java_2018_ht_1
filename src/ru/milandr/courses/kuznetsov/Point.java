public class Point {
    private double x;
    private double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX (double x) {
        this.x = x;
    }

    public double getX () {
        return this.x;
    }

    public void setY (double y) {
        this.y = y;
    }

    public double getY () {
        return this.y;
    }

    public double getDistance (Point point) {
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

    public String getLnEquation (Point point) {
        double k = Math.pow(point.y - this.y, 2) / Math.pow(point.x - this.x, 2);
        double b = this.y - k * this.x;

        if (b > 0)
            return String.format("Y = %.3f * X + %.3f\n", k, b);
        else if (b < 0)
            return String.format("Y = %.3f * X - %.3f\n", k, Math.abs(b));
        else
            return String.format("Y = %.3f * X\n", k);
    }

    public Point getMiddle (Point point) {
        return new Point((point.x + this.x) / 2, (point.y + this.y) / 2);
    }

    public String getCircEquation (Point point) {
        Point center = this.getMiddle(point);
        double radius = center.getDistance(point);

        if (center.x == 0 && center.y != 0)
            return String.format("x ^ 2 + (y - %.3f) ^ 2 = %.3f", center.y, Math.pow(radius, 2));
        else if (center.x != 0 && center.y == 0)
            return String.format("(x - %.3f) ^ 2 + y ^ 2 = %.3f", center.x, Math.pow(radius, 2));
        else
            return String.format("x ^ 2 + y ^ 2 = %.3f", Math.pow(radius, 2));
    }
}