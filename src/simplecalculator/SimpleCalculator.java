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
			System.out.println(number1 + " " + operator + " " + number2 + " equals " + (number1 + number2));
		}

		if (operator.equals("-")) {
			System.out.println(number1 + " " + operator + " " + number2 + " equals " + (number1 - number2));
		}

		if (operator.equals("*")) {
			System.out.println(number1 + " " + operator + " " + number2 + " equals " + (number1 * number2));
		}

		if (operator.equals("/")) {
			System.out.println(number1 + " " + operator + " " + number2 + " equals " + (number1 / number2));
		}
	}
}

//Welcome to Calculator.  What is the first number? 42
//What is the second number? 8
//Do you want to: +   -   *   or   //
//42.0 / 8.0 equals 5.25