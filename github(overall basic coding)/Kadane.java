import java.util.Scanner;
import java.util.Arrays;

public class Kadane {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i] =in.nextInt();
        }
        int cur =arr[0];
        int maxsum =arr[0];
        for (int i=1;i<arr.length;i++){
            if(cur<0){
                cur = arr[i];
            }
            else {
                cur = cur + arr[i];
            }
            maxsum =Math.max(maxsum,cur);
        }

        System.out.println(maxsum);
    }
}
