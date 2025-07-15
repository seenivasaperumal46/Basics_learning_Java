public class Snake_print {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {8, 7, 6, 5},
                {9, 10, 11, 12},
                {16, 15, 14, 13}
        };

        printSnake(mat);
    }
    public static void printSnake(int[][] mat) {
        int n= mat.length;
        int m=mat[0].length;


        for(int i=0;i<n;i++) {
            if(i%2==0) {
                for (int j = 0; j < m; j++) {
                    System.out.print(mat[i][j] + " ");
                }
               // System.out.println();
            }

            else{
            for (int j =m-1; j >=0; j--) {
                System.out.print(mat[i][j]+" ");
            }
              //  System.out.println();
            }
        }
    }
}
