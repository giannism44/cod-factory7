package gr.aueb.cf.ch7;

public class TraverseWithSubString {

    public static void main(String[] args) {
        String s = "Athens Uni Of Econ and Bus";

        for (int i = 0; i < s.length(); i++){
            System.out.print(s.substring(i,i+1));
        }
    }
}
