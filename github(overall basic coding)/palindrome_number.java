import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
    static boolean isPalindrome(int n) {
                int original = n;
                int ans = 0;
                while(n>0){
                    int digit = n % 10;
                    ans = ans*10+digit;
                    n/=10;
                }
         return original==ans;
    }
}
