import java.util.Scanner;

public class StudentResultAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask student's name
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        // Ask marks in 3 subjects
        System.out.print("Enter marks in Subject 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int mark3 = sc.nextInt();

        // Calculate total
        int total = mark1 + mark2 + mark3;

        // Calculate average using type casting
        double average = (double) total / 3;

        // Display result
        System.out.println("\n----- STUDENT RESULT -----");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        // Check pass or fail
        if (mark1 >= 40 && mark2 >= 40 && mark3 >= 40) {
            System.out.println("Result: PASS");

            // Check distinction
            if (average >= 75) {
                System.out.println("Distinction: YES");
            } else {
                System.out.println("Distinction: NO");
            }

            // Check special award
            if (average >= 90) {
                System.out.println("Special Award: YES 🏆");
            } else {
                System.out.println("Special Award: NO");
            }

        } else {
            System.out.println("Result: FAIL");
            System.out.println("Distinction: NO");
            System.out.println("Special Award: NO");
        }

        sc.close();
    }
}