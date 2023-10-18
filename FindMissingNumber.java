import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " distinct numbers between 1 and " + n + " (inclusive):");

        for (int i = 0; i < n - 1; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int inputNumber;
            do {
                inputNumber = scanner.nextInt();
                if (inputNumber < 1 || inputNumber > n) {
                    System.out.println("Number must be between 1 and " + n + ". Please enter a valid number.");
                }
            } while (inputNumber < 1 || inputNumber > n);
            numbers[i] = inputNumber;
        }


        int totalSum = (n * (n + 1)) / 2;


        int sumOfGivenNumbers = 0;
        for (int num : numbers) {
            sumOfGivenNumbers += num;
        }


        int missingNumber = totalSum - sumOfGivenNumbers;


        System.out.println("The missing number is: " + missingNumber);

        scanner.close();
    }
}
