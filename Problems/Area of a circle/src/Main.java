import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        float radius = scanner.nextFloat();
        System.out.println(Math.PI * radius * radius);
    }
}