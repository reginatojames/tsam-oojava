package es1.main;

public class Rectangle extends Shape{
	
	
	public double perimeter(){
		
		double pem = 0;
		
		pem = (width * 2) + (height * 2);
		
		return pem;				
	}
	
	public double area(){
		
		double ar = 0;
		
		ar = width * height;
		
		return ar;
	}
}
