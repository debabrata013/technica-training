package test;

import java.util.Scanner;

public class Sol3 {
    // Method to count non-zero characters in a string
    static int q1(String str) {
        if (str.length() == 0) return 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                count++;
            }
        }
        return count;
    }

    // Method to check if there exists a subarray with sum equal to x
    static void q2(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                if (sum == x) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }

    // Method to print a trapezoidal pattern
    static void q3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(".");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(".");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // New method to find the maximum element in an array
    static int q4(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example usage of q1 method
        System.out.println("Enter the value of N:");
        String n = sc.nextLine();
        System.out.println("Question 1 output is " + q1(n));

        // Example usage of q2 method
        System.out.println("Enter the size of the array:");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of target sum of two elements:");
        int x = sc.nextInt();
        System.out.println("Question 2 output is ");
        q2(arr, x);

        // Example usage of q3 method
        System.out.println("Enter the value N for printing the trapezoidal pattern:");
        int n1 = sc.nextInt();
        System.out.println("Question 3 output is ");
        q3(n1);

        // Example usage of q4 method
        System.out.println("The maximum element in the array is: " + q4(arr));

        sc.close();
    }
}