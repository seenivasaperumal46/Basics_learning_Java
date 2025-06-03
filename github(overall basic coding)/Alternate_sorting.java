import java.util.Arrays;

public class Alternate_sorting {

    public static void alternateSort(int[] arr) {
        Arrays.sort(arr); // Step 1: Sort the array

        int i = 0; // Start pointer
        int j = arr.length - 1; // End pointer

        while (i <= j) {
            if (i == j) {
                System.out.print(arr[i]); // For the middle element in odd-sized array
            } else {
                System.out.print(arr[i] + " " + arr[j] + " ");
            }
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2 ,5,5,93,3,4,5,4,3,34,4};
        System.out.print("Alternate sorted output: ");
        alternateSort(arr);
    }
}
