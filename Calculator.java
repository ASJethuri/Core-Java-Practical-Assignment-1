import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        if (operator == '+') {
            System.out.println("Answer = " + (number1 + number2));
        } 
        else if (operator == '-') {
            System.out.println("Answer = " + (number1 - number2));
        } 
        else if (operator == '*') {
            System.out.println("Answer = " + (number1 * number2));
        } 
        else if (operator == '/') {
            if (number2 != 0) {
                System.out.println("Answer = " + (number1 / number2));
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } 
        else {
            System.out.println("Invalid operator.");
        }

        scanner.close();
    }
}