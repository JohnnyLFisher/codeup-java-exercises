package shapes;


import util.Input;

public class CircleApp {
	public static void main(String[] args) {
		Input input = new Input();
		double radius = input.getDouble();
		Circle circle = new Circle(radius);
		System.out.println("circle.getArea() = " + circle.getArea());
		System.out.println("circle.getCircumference() = " + circle.getCircumference());
	}
}
