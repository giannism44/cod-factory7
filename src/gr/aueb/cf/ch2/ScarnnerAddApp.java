package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Scannet Demo. Reads two integers from
 * std iput (keyboard) and calculates the result
 */
public class ScarnnerAddApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση τιμών
        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        //Εντολές
        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("Το άθροισμα των %d και %d είναι ίσο με %d" , num1, num2, sum);
    }
}
