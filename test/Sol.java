package test;

import java.util.HashMap;
import java.util.Scanner;

public class Sol {
    // Method to check if a string can be rearranged to form a palindrome
    static void q1(String str) {
        int n = str.length();
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Count the frequency of each character
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int oddCount = 0;
        // Count the number of characters with odd frequency
        for (int count : map.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // A string can be rearranged to form a palindrome if it has at most one character with an odd frequency
        if (oddCount == 0 || oddCount == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    // Method to calculate the number of days to consume all chocolates
    static void q2(int chocolates, int wrappers) {
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

    // Method to find the maximum area of water that can be contained
    static void q3(int[] heights) {
        int left = 0, right = heights.length - 1;
        int maxArea = 0;
        
        while (left <= right) {
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            maxArea = Math.max(maxArea, height * width);
            
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(maxArea);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string for q1:");
        String str = scanner.nextLine();

        System.out.println("Enter the number of chocolates for q2:");
        int chocolates = scanner.nextInt();

        System.out.println("Enter the number of chocolate wrappers for q2:");
        int wrappers = scanner.nextInt();

        System.out.println("Enter the size of the array for q3:");
        int n = scanner.nextInt();
        int[] heights = new int[n];

        System.out.println("Enter the array elements for q3:");
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        q1(str);
        q2(chocolates, wrappers);
        q3(heights);

        scanner.close();
    }
}