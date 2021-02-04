package shapes;

public class ShapesTest {
	public static void main(String[] args) {
		Measurable myShape;

		myShape = new Rectangle(5,4);
		System.out.println("myShape.getArea() = " + myShape.getArea());
		System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());
	}
}
