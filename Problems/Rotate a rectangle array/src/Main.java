import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        // put your code here
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        for (int j = 0; j < m; j++) {
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}