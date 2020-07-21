package ru.milandr.courses.polishchuk;

public class Alcohol {
	private String	name;
	private String	manufacturer;
	private double	degree;
	private double	volume;
	private Color	color;
	private double	transparency;
	private double	fillPercentage;
	private double	age;

	Alcohol() {
		this.name = null;
		this.manufacturer = null;
		this.degree = 0.;
		this.volume = 0.;
		this.color = null;
		this.transparency = 0.;
		this.fillPercentage = 0.;
		this.age = -1;
	}

	Alcohol(String name, String manuf, double degree, double volume, Color color, double transparency, double fillPercentage, int age) {
		this.name = name;
		this.manufacturer = manuf;
		this.degree = degree;
		this.volume = volume;
		this.color = color;
		this.transparency = transparency;
		this.fillPercentage = fillPercentage;
		this.age = age;
	}

	Alcohol(String name, String manuf, double degree, double volume) {
		this(name, manuf, degree, volume, new Color(255, 255, 255), 1., 100., -1);
	}

	public void print() {
		System.out.format(
			"Name: %s\n" +
			"Manufacturer: %s\n" + 
			"Degree: %.1f\n" +
			"Volume (mL): %.3f\n" +
			"RGB Color: %X\n" +
			"Transparency: %f\n" +
			"Fill percentage: %.2f\n",
				this.name,
				this.manufacturer,
				this.degree,
				this.volume,
				this.color.getRGB(),
				this.transparency,
				this.fillPercentage
		);
		this.printAge();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String mname) {
		this.manufacturer = mname;
	}
	
	public double getDegree() {
		return this.degree;
	}

	public void setDegree(double degree) {
		this.degree = degree;
	}

	public double getVolume() {
		return this.volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public Color getColor() {
		return this.color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setColor(int rgb) {
		this.color = new Color(rgb);
	}

	public void setColor(int r, int g, int b) {
		this.color = new Color(r, g, b);
	}

	public double getTransparency() {
		return this.transparency;
	}

	public void setTransparency(double transp) {
		this.transparency = transp;
	}

	public double getFillPercentage() {
		return this.fillPercentage;
	}

	public void setFillPercentage(double percent) {
		this.fillPercentage = percent;
	}

	public double pourOut(double percent) {
		double pouredOut = percent;

		if (percent < 0.)
			return 0.;
		this.fillPercentage -= percent;
		if (this.fillPercentage < 0.)
		{
			pouredOut = percent + this.fillPercentage;
			this.fillPercentage = 0.;
		}
		return pouredOut;
	}

	public boolean isEmpty() {
		if (this.fillPercentage == 0.)
			return true;
		return false;
	}

	public void printAge() {
		System.out.print("Age: ");
		if (this.age < 0)
			System.out.println("Undefined");
		else
			System.out.format("%d\n", this.age);
	}

	public double getAge() {
		return this.age;
	}
	
	public void setAge(double age) {
		this.age = age;
	}

	public void addAge(double years) {
		if (years < 0)
			return;
		this.age += years;
	}

}
