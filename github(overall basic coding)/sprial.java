public class sprial {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n - 1;
        for (int i = 0; i <= m; i++) {
            if (i % 2 == 0) {
                for (int j = left; j <= right; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = right; j >= left; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
