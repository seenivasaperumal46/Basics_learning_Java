import java.util.*;
public class problem {
    public static void main(String[] args) {
        int[] arr ={4,3,2,6,8,9};
        int n=arr.length;
        int res=0;
        while(n>2){
            int sum=0;
            for(int i=0;i<n;i++) {
                Arrays.sort(arr);
                sum = arr[0] + arr[1];
            }
            res+=sum;
            n--;
        }
        System.out.println(res);
    }
}
