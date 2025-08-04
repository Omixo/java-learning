import java.util.Scanner;

public class CustomEvenFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        while (true) {
            System.out.print("Enter a number: ");
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                break; 
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next(); 
            }
        }

        int lastDigit = Math.abs(num % 10);

        if (num % 2 == 0 && (lastDigit == 2 || lastDigit == 3 || lastDigit == 6 || lastDigit == 8 || lastDigit == 0)) {
            System.out.println(num + " is divisible by 2");
        } else {
            System.out.println(num + " is not divisible by 2");
        }

        sc.close();
    }
}
