package gr.aueb.cf.training;

import java.util.Scanner;

public class Days {

    public static void main(String[] args) {
        int choice = 0;
        int stars = 0;
        Scanner in = new Scanner(System.in);

       do{
            printMenu();
           choice = in.nextInt();
           if (choice < 1 || choice > 6){
               System.out.println("Λαθος επιλογη");
               continue;
           }
           if (choice != 6){
               System.out.println("Δωσε αριθμο απο αστερακια");
               stars = in.nextInt();
           }

           switch (choice){
               case 1:
                   printStarsH(stars);
                   break;
               case 2:
                   printStarsV(stars);
                   break;
               case 3:
                   printStarsHV(stars);
                   break;
               case 4:
                   printStarsAsc(stars);
                   break;
               case 5:
                   printStarsDesc(stars);
                   break;
               case 6:
                   System.out.println("Quiting");
                   break;
               default:
                   System.out.println("Error not correct number");
           }
       }while (choice != 6);
    }


    public static void printMenu() {
        System.out.println("Διαλεξτε μια απο τις επιλογες");
        System.out.println("1. Οριζόντια Αστεράκια");
        System.out.println("2. Κάθετα Αστεράκια");
        System.out.println("3. nxm Αστεράκια");
        System.out.println("4. Ascending Αστεράκια");
        System.out.println("5. Descending Αστεράκια");
        System.out.println("6. Έξοδος");
    }

    public static void printStarsH(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printStarsV(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
        System.out.println();
    }

    public static void printStarsHV(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(n);
        }
    }

    public static void printStarsAsc(int n) {
        for (int i = 1; i <= n; i++) {
            printStarsH(i);
        }
    }

    public static void printStarsDesc(int n) {
        for (int i = n; i >= 1; i--) {
            printStarsH(i);
        }
        System.out.println();
    }
}