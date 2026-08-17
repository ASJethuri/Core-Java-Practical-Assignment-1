import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        // Taking 10 numbers as input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Assume the first number is the maximum
        int maximum = numbers[0];

        // Find the maximum number
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        System.out.println("\nMaximum value = " + maximum);

        sc.close();
    }
}