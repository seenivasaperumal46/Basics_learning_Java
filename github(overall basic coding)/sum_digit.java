import java.util.Scanner;

public class sum_digit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum =n*m;

        while(sum>9) {
            int res = 0;
            while(sum!=0) {
                res = res + sum % 10;
                sum= sum / 10;
            }
            sum=res;
        }
        System.out.println(sum);
    }
}
