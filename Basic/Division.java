import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        double quotient = (double) num1 / num2;

        System.out.println(num1 + " / " + num2 + " = " + quotient);

        scanner.close();
    }
}
