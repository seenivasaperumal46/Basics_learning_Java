import java.util.Enumeration;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        //for(int num=1; num<=n;num++){
         //   System.out.println((num));}

        //while loops
        int num=1;
        while(num<=n){
            System.out.println(num);
            num++;
        }
    }

}
