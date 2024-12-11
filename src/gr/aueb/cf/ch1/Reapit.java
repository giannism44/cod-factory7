package gr.aueb.cf.ch1;

import java.util.Scanner;

public class Reapit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Please select one number");
            System.out.println("1: Εισαγωγη");
            System.out.println("2. Διαγραφη");
            System.out.println("3. Ενημερωση");
            System.out.println("4. Αναζητηση");
            System.out.println("5. Εξοδος");
            choice = in.nextInt();
        }while (choice != 5);

        System.out.println("Thaks for using the menu app");
    }
}
