package gr.aueb.cf.ch4;

/**
 * Prints different outputs of stars.
 */
public class Stars {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            System.out.print("*");
        }

        for (int i = 1; i <= 10; i++){
            System.out.println("*");
        }

        for (int i = 1; i <= 10; i ++){
            for (int j = 1; j <= 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //1st row: 1 star
        //2st row: 2 star
        //3st row: 3 star, ect
        //Ascending
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Descending
        for (int i = 1; i <= 10; i++){
            for (int j = i; j <= 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
