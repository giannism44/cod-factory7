package gr.aueb.cf.ch1;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        int day ;
        int months ;
        int year ;
        int finalyear = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Δωσε μου 3 ακεραιους αριθμους");
        day = in.nextInt();
        months = in.nextInt();
        year = in.nextInt();
        finalyear = year % 100;

        System.out.printf("%02d/%02d/%02d" , day , months , finalyear);
    }
}
