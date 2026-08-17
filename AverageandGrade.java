import java.util.Scanner;

public class AverageandGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        // Input marks for 5 subjects
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            total = total + marks[i];
        }

        // Calculate average
        double average = total / 5.0;

        // Display total and average
        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average Marks = " + average);

        // Assign grade
        if (average >= 90) {
            System.out.println("Grade = A");
        } 
        else if (average >= 75) {
            System.out.println("Grade = B");
        } 
        else if (average >= 50) {
            System.out.println("Grade = C");
        } 
        else {
            System.out.println("Grade = Fail");
        }

        sc.close();
    }
}