package test;

import java.util.*;

public class Sol2 {
    // Method to find the k-th largest factor of n
    public static int q1(int n, int k) {
        List<Integer> factors = new ArrayList<>();

        // Find all factors of n
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                factors.add(i);
                if (i != n / i) {
                    factors.add(n / i);
                }
            }
        }

        // Sort factors in descending order
        Collections.sort(factors, Collections.reverseOrder());

        // Check if k is within the range of factors
        if (k > factors.size()) {
            return -1;
        }
        return factors.get(k - 1);
    }

    // Method to calculate the number of days to consume all chocolates
    static void q3(int chocolates, int wrappers) {
        int days = 0;
        chocolates += wrappers / 7;

        while (chocolates > 0) {
            days++;
            wrappers++;
            chocolates--;
            if (wrappers % 7 == 0) {
                chocolates++;
                wrappers = wrappers % 7;
            }
        }
        System.out.println(days);
    }

    // Method to print a pattern based on the given number n
    public static void q2(int n) {
        if (n < 2) {
            System.out.println("Not Possible");
            return;
        }
        int size = 2 * n - 1;
        int[][] pattern = new int[size][size];

        // Fill the pattern array
        for (int i = 0; i < n; i++) {
            int start = i;
            int end = size - i - 1;
            for (int j = start; j <= end; j++) {
                pattern[start][j] = n - i;
                pattern[end][j] = n - i;
                pattern[j][start] = n - i;
                pattern[j][end] = n - i;
            }
        }

        // Print the pattern
        for (int[] row : pattern) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println(q1(12, 3));
        q3(10, 15);
        q2(5);
  
  } }
