package gr.aueb.cf.ch7;

public class StringInit {

    public static void main(String[] args){
        int num = 2;
        mul(num);
        System.out.println(num);
    }

    public static void mul(int num){
        num = num * num * num;
    }
}
