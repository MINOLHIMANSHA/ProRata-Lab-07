import java.util.Scanner;

public class IT24103207Lab7Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);
            System.out.print("Enter total bill amount: ");
            double bill = sc.nextDouble();
            System.out.print("Enter mode of payment (C - Cash, O - Other): ");
            char mode = sc.next().charAt(0);

            if (mode == 'C' || mode == 'c') {
                double discount = bill * 5 / 100;
                System.out.println("Discount: " + discount);
                System.out.println("Amount to be paid: " + (bill - discount));
            } else if (mode == 'O' || mode == 'o') {
                System.out.println("Discount: 0.0");
                System.out.println("Amount to be paid: " + bill);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
            System.out.println();
        }
    }
}
