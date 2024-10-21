package loops;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // Read the input number
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            sc.close();
            return;
        }

        int number = sc.nextInt();

        // Check if the number is within the valid range
        if (number < 1 || number > 1000000000) {
            System.out.println("Number out of valid range.");
            sc.close();
            return;
        }

        // Store the original number
        int originalNumber = number;

        // Count the number of digits
        int numDigits = 0;
        int temp = number;
        while (temp > 0) {
            temp /= 10;
            numDigits++;
        }

        // Reset the number to its original value
        number = originalNumber;

        // Calculate the sum of each digit raised to the power of numDigits
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        sc.close();
    }
}

