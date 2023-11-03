package simplecalculator;

public class SimpleCalculator {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("Welcome to Calculator.  What is the first number? ");
		double number1 = scanner.nextDouble();

		System.out.print("What is the second number? ");
		double number2 = scanner.nextDouble();

		System.out.print("Do you want to: +   -   *   or   /");
		String operator = scanner.next();

		if (operator.equals("+")) {
			System.out.printf("%s %s %s equals %.2f%n", number1, operator, number2, (number1 + number2));
		}

		if (operator.equals("-")) {
			System.out.printf("%s %s %s equals %.2f%n", number1, operator, number2, (number1 - number2));
		}

		if (operator.equals("*")) {
			System.out.printf("%s %s %s equals %.2f%n", number1, operator, number2, (number1 * number2));
		}

		if (operator.equals("/")) {
			if (number2 != 0) {
				System.out.printf("%s %s %s equals %.2f%n", number1, operator, number2, (number1 / number2));
			} else {
				System.out.println("Division by zero is not allowed.");
			}
		}

		scanner.close();
	}
}
