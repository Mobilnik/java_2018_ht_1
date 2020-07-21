package ru.milandr.courses.polishchuk;

public class Point {
	public double x;
	public double y;

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance(Point p) {
		return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
	}

	public void printLineEquation(Point p) {
		double k;

		if (this.x == p.x)
			System.out.format("x = %f\n", this.x);
		else
		{
			k = (this.y - p.y) / (this.x - this.y);
			System.out.format("y = %f * x %+f\n", k, this.y - k * this.x);
		}
	}

	public Point getMiddle(Point p)
	{
		return new Point((this.x + p.x) / 2., (this.y + p.y) / 2.);
	}

	public void printCircleEquation(Point p)
	{
		Point middle = this.getMiddle(p);

		System.out.format(
			"(x %+.3f)^2 + (y %+.3f)^2 = (%.3f)^2\n",
				-middle.x, -middle.y,
				this.getDistance(p) / 2.
		);
	}

	public void print()
	{
		System.out.format("(%f, %f)", this.x, this.y);
	}
}
