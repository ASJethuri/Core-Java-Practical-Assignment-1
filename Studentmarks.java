import java.util.Scanner;

public class Studentmarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];

        // Taking marks as input
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Displaying marks
        System.out.println("\nMarks of Students:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        sc.close();
    }
}