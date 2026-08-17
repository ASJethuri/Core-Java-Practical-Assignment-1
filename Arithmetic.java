import java.util.Scanner;

public class Arithmetic{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();

        System.out.println("\n--- Arithmetic Results ---");
        System.out.println("Addition: " + (firstNumber + secondNumber));
        System.out.println("Subtraction: " + (firstNumber - secondNumber));
        System.out.println("Multiplication: " + (firstNumber * secondNumber));

        if (secondNumber != 0) {
            System.out.println("Division: " + (firstNumber / secondNumber));
            System.out.println("Modulus: " + (firstNumber % secondNumber));
        } else {
            System.out.println("Division: Cannot divide by zero");
            System.out.println("Modulus: Cannot divide by zero");
        }

        sc.close();
    }
}