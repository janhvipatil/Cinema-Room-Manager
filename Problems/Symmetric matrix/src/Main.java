import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        boolean symmetric = false;
        int symCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (arr[i][j] == arr[j][i]) {
                        symCount++;
                    }
                }
            }
        }
        if (symCount == (n*n)-n) {
            symmetric = true;
        }

        if (symmetric) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
