// Task4_CurrencyConverter_Simple.java

import java.util.Scanner;

public class Task4_CurrencyConverter_Simple {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double rate = 0;

        System.out.println("===== CURRENCY CONVERTER =====");

        System.out.print("Enter Base Currency (USD/INR/EUR): ");
        String base = sc.next().toUpperCase();

        System.out.print("Enter Target Currency (USD/INR/EUR): ");
        String target = sc.next().toUpperCase();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        // Fixed exchange rates (simple)
        if (base.equals("USD") && target.equals("INR"))
            rate = 83;
        else if (base.equals("INR") && target.equals("USD"))
            rate = 1.0 / 83;
        else if (base.equals("USD") && target.equals("EUR"))
            rate = 0.92;
        else if (base.equals("EUR") && target.equals("USD"))
            rate = 1.08;
        else if (base.equals("INR") && target.equals("EUR"))
            rate = 0.011;
        else if (base.equals("EUR") && target.equals("INR"))
            rate = 90;
        else if (base.equals(target))
            rate = 1;
        else {
            System.out.println("Invalid Currency!");
            System.exit(0);
        }

        double result = amount * rate;

        System.out.println("\nConverted Amount: " + result + " " + target);

        sc.close();
    }
}
