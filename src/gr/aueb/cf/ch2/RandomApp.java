package gr.aueb.cf.ch2;

/**
 * Random Class
 */
public class RandomApp {

    public static void main(String[] args) {
        int die = (int) (Math.random() * 6) + 1;
        System.out.println(die);

    }
}