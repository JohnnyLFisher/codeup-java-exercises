package shapes;

public class Circle {

	static double pi = Math.PI;
	private double radius;
	private double circumference;
	private double area;

	public double getPi() {
		return pi;
	}

	public double getRadius() {
		return radius;
	}

	public double getCircumference() {
		return circumference;
	}

	public double getArea() {
		return area;
	}

	public Circle(double radius) {
		this.radius = radius;
		this.area = radius * 2 * pi;
		this.circumference = radius * radius * pi;
	}

}
