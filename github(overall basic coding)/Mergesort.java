import java.util.*;

public class Mergesort {
    public static void main(String[] args) {
        int[] num1 ={1,2,3,4,5,5,6,42};
        int[] num2 ={3,4,5,6};
        List<Integer> res = new ArrayList<>();
        res = merge(num1,num2);
        System.out.println(res);
    }
    static List<Integer> merge(int[] num1 ,int[] num2){
        List<Integer> res = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<num1.length && j< num2.length){
            if(num1[i] == num2[j]){
                addifdup(res,num1[i]);
                i++;
                j++;
            }
            else if(num1[i]<num2[j]){
                addifdup(res,num1[i]);
                i++;
            }
            else{
                addifdup(res,num2[j]);
                j++;
            }
        }
        while(i<num1.length) {
            addifdup(res, num1[i]);
            i++;
        }
        while(j<num2.length) {
            addifdup(res, num2[j]);
            j++;
        }
        return res;
    }
    static void addifdup(List<Integer> res,int num){
        if(res.isEmpty() || res.get(res.size()-1) !=num ){
            res.add(num);
        }
    }
}
