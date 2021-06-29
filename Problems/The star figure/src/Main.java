import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // put your code here

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = n / 2;
        String[][] star = new String[n][n];

        for (int i = 0; i < star.length; i++) {
            for (int j = 0; j < star[i].length; j++) {
                if (i == j || i + j == n - 1 ||
                        i == k || j == k) {
                    star[i][j] = "*";
                } else {
                    star[i][j] = ".";
                }
            }
        }

        for (String[] strings : star) {
            for (String string : strings) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
    }
}