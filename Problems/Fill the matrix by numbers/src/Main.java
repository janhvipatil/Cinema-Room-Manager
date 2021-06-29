import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrix[i][j] = 0;
                } else if (i < j) {
                    matrix[i][j] = j - i;
                } else {
                    matrix[i][j] = i - j;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print("\n");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}