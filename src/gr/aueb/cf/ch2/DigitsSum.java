package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Να λαμβάνει ως input απο τον χρήστη ένα
 * διψήφιο ακέραιο και να υπολογίζει
 * και να εκτυπώνει το άθροισμα των ψηφίων του.
 * Για παράδειγμα, αν ο χρήστησ δώσει τον
 * ακέραιο 15, θα πρέπει το αποτέλεσμα να είναι
 * 1 + 5 =6.
 */
public class DigitsSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum;
        int leftDigit = 0;
        int rightDigit = 0;
        int sum = 0;

        System.out.println("Give a two digit integer");
        inputNum = in.nextInt();

        leftDigit = inputNum / 10; //Με div 10 παίρνουμε το αριστέρο ψηφίο
        rightDigit = inputNum % 10; //Με mod 10 παίρνουμε το δεξί ψηφίο
        sum = leftDigit + rightDigit;

        System.out.printf("Input num: %d, left digit: %d , Right digit: %d, Sum: %d", inputNum , leftDigit , rightDigit, sum);
    }
}
