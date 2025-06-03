import java.util.Scanner;

public class remove_element {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int val =sc.nextInt();
        int n = sc.nextInt();
        int[] nums =new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(nums);
    }
    static int[] remove(int[] nums,int val ){
        int i=0;
        for(int j=0;j< nums.length;j++) {
            if (nums[i] !=val) {
                nums[i++] =nums[j];
            }
        }
        return nums;
    }
}
