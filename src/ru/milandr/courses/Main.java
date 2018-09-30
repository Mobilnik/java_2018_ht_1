package ru.milandr.courses.Ozherelev;

public class Main {

    public static void main(String[] args) {
	    Employee Person = new Employee("Vitek", 0, 1000, 1000, 250);
		Employee Person2 = new Employee("Pashan",10, 1000, 19);
	    Person.SetAge(20);
	    int res = Person.GetAge();

	    System.out.println(res);
	    System.out.println(Person2.GetProjectID());

	    System.out.println("Class Point Tests");
	    Point A = new Point(10.0, 11.0);
	    Point B = new Point(11.0, 10.0);
		Point B1 = new Point(10.0, 11.0);
	    Point C = new Point(A, B);
	    System.out.println(C.Distance(B));
	    System.out.printf("%f %f\n", C.GetY(), C.GetX());

	    System.out.println("Circle Test");
		Circle Cir = new Circle(A, B);
		System.out.printf("%f %f %f\n", Cir.GetCenter().GetX(), Cir.GetCenter().GetY(), Cir.GetRadius());

		System.out.println("Class Line tests");

		Line line = new Line(B1, A);
		System.out.printf("%.2f*x + %.2f*y + %.2f = 0", line.GetValX(), line.GetValY(), line.GetValC());
    }
}
