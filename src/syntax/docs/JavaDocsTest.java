package syntax.docs;

/** A really really cool class for doing cool things
 * @author Codeup
 * @version 1.337
 */
public class JavaDocsTest {

	/** A typical main method
	 * @author Codeup
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(add(1, 2));
	}

	/** Add two operands together
	 *
	 * @param num1 the first number passed into the method
	 * @param num2 the second number passed into the method
	 * @return the sum of num1 and num2
	 */
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

}