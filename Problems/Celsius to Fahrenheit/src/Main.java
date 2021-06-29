import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        float celsius = scanner.nextFloat();
        float fahrenheit = (float) (celsius * 1.8 + 32);
        System.out.println(fahrenheit);
    }
}