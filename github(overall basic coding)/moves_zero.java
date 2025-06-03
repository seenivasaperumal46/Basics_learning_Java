import java.util.Arrays;

public class moves_zero {
    public static void main(String[] args) {
       int[] arr ={4,0,7,8,0,3,9,8,0,90,0,5};
       move(arr);
       System.out.println(Arrays.toString(arr));
    }
    static void move(int[] arr){
        int j = 0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
