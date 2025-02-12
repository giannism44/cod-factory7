package gr.aueb.cf.ch2;

import org.w3c.dom.ls.LSOutput;

import java.util.function.DoubleFunction;
/**
 * Εμφανίζει τους τύπους δεδομένων ακεραίων,
 * int , byte , short , long μαζί με το μεγεθός τους,
 * και το range (min ,  max)
 */
public class IntApp {
    public static void main(String[] args) {
        System.out.printf("int. Size: %d, Min: %,d, Max: %,d\n" , Integer.BYTES * 8 , Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Byte. Size: %d, Min: %d, Max: %d\n" , Byte.BYTES * 8 , Byte.MAX_VALUE , Byte.MAX_VALUE) ;
        System.out.printf("short. Size: %d, Min: %d, Max:%d\n", Short.BYTES * 8, Short.MIN_VALUE , Short.MAX_VALUE);
        System.out.printf("long. Size: %d, Min: %,d, Max:%,d\n" , Long.BYTES * 8 , Long.MIN_VALUE , Long. MAX_VALUE);
    }
}
