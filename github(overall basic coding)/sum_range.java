import java.util.Scanner;

public class sum_range {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m =sc.nextInt();
        int sum  =0;
        for(int i=n;i<=m;i++){
            sum+=i;
        }
        if(m>9999) System.out.println("invalid data");
        else System.out.println(sum);
    }
}
