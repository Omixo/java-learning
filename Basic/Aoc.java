import java.util.Scanner;

public class Aoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println( " Eneter radius " );
    float radius = scanner.nextFloat();
    float area = (float) (Math.PI * radius * radius);
    System.out.println("Area of circle with radius " + radius + " is: " + area);
    }
}
