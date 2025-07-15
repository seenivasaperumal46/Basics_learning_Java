import java.util.*;
public class print_all_divisor_of_number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        print_prime(n);

    }
    public static void print_prime(int n){

        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
                System.out.print(i+" ");
                if(n/i !=i){
                    System.out.print((n/i)+" ");
                }
            }
        }
    }
}
