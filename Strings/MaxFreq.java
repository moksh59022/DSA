package Strings;

import java.util.Scanner;

public class MaxFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();

        int[] freq = new int[256];

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i)]++;
        }


        int max = 0;
        int min = Integer.MAX_VALUE;


        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                max = Math.max(max, freq[i]);
                min = Math.min(min, freq[i]);

            }
        }
        System.out.print("Highest frequency character(s): ");
        for (int i = 0; i < 256; i++) {
            if (freq[i] == max) {
                System.out.print((char)i + " ");
            }
        }
        System.out.println(max);

        System.out.print("lowest frequency character(s): ");
        for (int i = 0; i < 256; i++) {
            if (freq[i] == min) {
                System.out.print((char)i + " ");
            }
        }
        System.out.println(min);


























        
//
//                Scanner sc = new Scanner(System.in);
//                String s = sc.nextLine();
//                int n = s.length();
//
//                // Array to store the frequency of each character (ASCII size 256)
//                int[] freq = new int[256];
//
//                // Calculate frequency of each character
//                for (int i = 0; i < n; i++) {
//                    freq[s.charAt(i)]++;
//                }
//
//                // Initialize maxFreq and minFreq
//                int maxFreq = 0;
//                int minFreq = Integer.MAX_VALUE;
//
//                // Find the maximum frequency
//                for (int i = 0; i < 256; i++) {
//                    if (freq[i] > 0) {
//                        maxFreq = Math.max(maxFreq, freq[i]);
//                        minFreq = Math.min(minFreq, freq[i]);
//                    }
//                }
//
//                // Print characters with highest frequency
//                System.out.print("Highest frequency character(s): ");
//                for (int i = 0; i < 256; i++) {
//                    if (freq[i] == maxFreq) {
//                        System.out.print((char)i + " ");
//                    }
//                }
//                System.out.println(maxFreq);
//
//                // Print characters with lowest frequency
//                System.out.print("Lowest frequency character(s): ");
//                for (int i = 0; i < 256; i++) {
//                    if (freq[i] == minFreq) {
//                        System.out.print((char)i + " ");
//                    }
//                }
//                System.out.println(minFreq);
            }
        }


