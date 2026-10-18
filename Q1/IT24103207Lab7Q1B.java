import java.util.Scanner;

public class IT24103207Lab7Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int s = 1; s <= 3; s++) {
            System.out.print("Enter 4 subject marks of student " + s + " (separated by space): ");
            double total = 0;
            for (int i = 0; i < 4; i++) {
                total += sc.nextDouble();
            }
            double average = total / 4;
            String grade;
            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }
            System.out.println("Student " + s + " - Average: " + average + " Grade: " + grade);
        }
    }
}
