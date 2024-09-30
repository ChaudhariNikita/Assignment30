package Assignment30;

public class Triangle {
	private double side1;
	private double side2;
	private double side3;
	private double side;

	private double peri;

	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public void calculateArea() {
		side = (side1 + side2 + side3) / 2;
		System.out.println("Area is " + Math.sqrt((side * (side - side1) * (side - side2) * (side - side3))));
	}

	public void calPerimeter() {
		peri = side1 + side2 + side3;
		System.out.println("Perimeter is " + peri);
	}

}
