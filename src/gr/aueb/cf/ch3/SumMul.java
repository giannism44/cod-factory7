package gr.aueb.cf.ch3;

import javax.swing.*;

/**
 * Calculate the sum and mul of
 * first 10 intgers.
 */
public class SumMul {

    public static void main(String[] args) {
        int i = 1;
        int j =1;
        int mul = 1;
        int sum = 0;

        while (i <=10){
           //sum = sum + i;
            sum+= i;
            i++;
        }

        while (j <=10){
             mul = mul * j;
            j++;
        }
    }
}
