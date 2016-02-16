package es1.main;

public class Statistics {
	
	double area;
	double perimeter;
	
	public Statistics(double perimeter, double area) {
		this.area = area;
		this.perimeter = perimeter;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public void add(Statistics st){
		
		area += st.area;
		perimeter += st.perimeter;
	}
}
