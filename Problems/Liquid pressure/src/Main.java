import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        float liquidDensity = scanner.nextFloat();
        float columnHeight = scanner.nextFloat();
        double gravity = 9.8;

        double liquidPressure = liquidDensity * columnHeight * gravity;
        System.out.printf("%.3f",liquidPressure);
    }
}