import java.util.Arrays;
import java.util.Scanner;

public class Triple_multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        while(N-- >0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int result = sum(a, b, c);
            System.out.println(result);
        }
    }
    static int sum(int a,int b,int c){
        int Sum =a+b+c;
        if(Sum%3 !=0) return -1;
        int[] arr ={a,b,c};
        Arrays.sort(arr);
        int f=arr[0]; int m=arr[1]; int l=arr[2];
        int diff1 =l-f;
        int diff2 =l-m;

        if((diff1+diff2) % 2 !=0) return -1;
        int steps=(diff1+diff2) /2;
        return steps;
    }
}
