package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δικαίωμα ψήφου σε ηληκίες > 18
 * Ελέγχει αν μία ηλικία έχει δικαίωμα
 * να ψηφίσει
 */
public class VoteEligible {

    public static void main(String[] args) {
        final int VOTING_AGE = 18;
        boolean isEligible = false;
        int age = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        age = scanner.nextInt();

        isEligible = (age >= VOTING_AGE);

        System.out.println("You are eligible" + isEligible);
    }
}
