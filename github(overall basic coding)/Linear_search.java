import java.util.Arrays;
import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        int[] arr ={-1,2,3,4,-5,6,8,-9,10};
        int target =7;
        int ans =Linear(arr,target);
        System.out.println(ans);

    }
    //using enhanced for loop ==>for elements
    static int Linear2(int[] arr,int target){
        if(arr.length ==0){
            return -1;
        }
        for(int i:arr){
            if(target==i){
                return i;
            }
        }
        return -1;//if question is return value don't use -1 instead use Integer.MIn.values;
    }

    //using normal for loop; ==>for searching indexs,element and all.
    static int Linear(int[] arr,int target){
        if(arr.length ==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
           if(arr[i] ==target){
               return arr[i];
           }
        }
        return -1;  //if question is return value don't use -1 instead use Integer.MIn.values;
    }
}
