import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // put your code here

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        int k = scan.nextInt();

        int count = 0;
        int row = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0 || j == 0) {
                    count = 0;
                }
                if (matrix[i][j] == 0) {
                    count++;
                    if (count == k) {
                        row = i + 1;
                        break;
                    }
                }
            }
            if (row != 0) {
                break;
            }
        }
        System.out.println(row);

    }
}
