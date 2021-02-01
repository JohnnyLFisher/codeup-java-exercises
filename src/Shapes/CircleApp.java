package Shapes;

import util.Input;

public class CircleApp {

	public static void main(String[] args) {
		Input output = new Input();

		double radius = Double.parseDouble(output.setRadius());

		Circle circle = new Circle(radius);
		System.out.println("PI = " + circle.getPi());
		System.out.println("The radius of your circle is: " + circle.getRadius());
		System.out.println("The circumference of your circle is: " + circle.getCircumference());
		System.out.println("The area of your circle is: " + circle.getArea());

	}
}
