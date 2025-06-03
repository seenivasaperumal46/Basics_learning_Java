import java.util.Scanner;

public class Stringexample {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String ans =in.next();
        String gretings =greet(ans);
        System.out.println(gretings);



    }
    static String greet(String ans){
        String us =ans+" mapla";
        return us;
    }
}
