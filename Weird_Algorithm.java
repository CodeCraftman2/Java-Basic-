import java.util.Scanner;

public class Weird_Algorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            applyWeirdAlgorithm(n);
        }
    }

    public static void applyWeirdAlgorithm(int n) {
        System.out.println("Weird Algorithm for " + n + ":");
        while (n != 1) {
            System.out.print(n + " -> ");
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        System.out.println(1);
    }
}
