// Task2_StudentGradeCalculator.java

import java.util.Scanner;

public class Task2_StudentGradeCalculator {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);

        int subjects;
        int total = 0;

        System.out.println("===== STUDENT GRADE CALCULATOR =====");

        // number of subjects
        System.out.print("Enter number of subjects: ");
        subjects = sc.nextInt();

        int marks[] = new int[subjects];

        // input marks
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        // calculate average
        double average = (double) total / subjects;

        // grade calculation
        char grade;

        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 60)
            grade = 'C';
        else if (average >= 50)
            grade = 'D';
        else
            grade = 'F';

        // display results
        System.out.println("\n===== RESULT =====");
        System.out.println("Total Marks = " + total);
        System.out.println("Average Percentage = " + average + "%");
        System.out.println("Grade = " + grade);

        sc.close();
    }
}
