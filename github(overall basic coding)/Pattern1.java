import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        pattern(n);
    }
    static void pattern(int n){
        for(int row=0;row<=n;row++){
            for(int col=row;col<n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
