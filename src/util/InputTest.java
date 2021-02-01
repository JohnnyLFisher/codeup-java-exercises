package util;

public class InputTest {
	public static void main(String[] args) {
		Input output = new Input();
		output.yesNo();
		output.getString();
		output.getInt();
		output.getInt(1, 10);
		output.getDouble();
		output.getDouble(1, 10);
		output.setRadius();
	}
}
