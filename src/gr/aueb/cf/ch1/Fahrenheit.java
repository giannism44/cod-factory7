package gr.aueb.cf.ch1;

import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        int sum = 0;
        int far = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Δωσε μου εναν ακεραιοι θερμοκρασια");
        far = in.nextInt();

        sum = 5 * (far-32) / 9;

        System.out.printf("Η θερμοκρασια κελισου ειναι %d " ,sum);

    }
}
