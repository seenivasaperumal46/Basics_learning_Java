import java.util.HashSet;
import java.util.Scanner;

public class Unique_element {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] =sc.nextInt();
        }
        HashSet<Integer> set =new HashSet<>();
        for(int i:arr){
            if(set.contains(i)){
                set.remove(i);
            }
            else set.add(i);
        }
        System.out.println(set);
    }
}
