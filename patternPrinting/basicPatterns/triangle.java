package patternPrinting.basicPatterns;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                // Input the number of rows
                System.out.print("Enter the number of rows: ");
                int n = sc.nextInt();

                // Loop through each row
                for (int i = 0; i < n; i++) {
                    // Print spaces (for left padding)
                    for (int j = 0; j < n - i; j++) {
                        System.out.print(" ");
                    }

                    // Print stars
                    for (int j = 0; j < 2 * i - 1; j++) {
                        System.out.print("*");
                    }

                    // Move to the next line after printing each row
                    System.out.println();
                }

                sc.close();
            }
        }



