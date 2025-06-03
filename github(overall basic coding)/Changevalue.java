import java.util.Arrays;

public class Changevalue {
    public static void main(String[] args) {
        int[] arr = {12, 2, 4, 5, 6, 7};
        change(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void change(int[] nums) {
        nums[0] = 99;

    }
}
