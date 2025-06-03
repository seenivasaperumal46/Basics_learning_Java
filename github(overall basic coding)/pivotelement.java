import java.util.Scanner;

public class pivotelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        boolean ans = hasPivot(nums);
        System.out.println("Pivot exists? " + ans);
        sc.close();
    }

    static boolean hasPivot(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = total - leftSum - nums[i];
            if (leftSum == rightSum) return true;
            leftSum += nums[i];
        }
        return false;
    }
}
