package es1.main;

public class EquilateralTriangle extends Shape {

	public double perimeter() {

		double pem = 0;
		
		pem = base + base + base;
		
		return pem;
	}

	public double area() {

		double ar = 0;

		ar = (base * height) / 2;

		return ar;
	}
}
