package cw;

import java.util.*;

class C {
    // Method to find two ice cream prices that sum up to the given amount
    static ArrayList<Integer> findIceCreamPair(int targetSum, int prices[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0, right = prices.length - 1;
        Arrays.sort(prices); // Sort the prices array

        while (left < right) {
            int sum = prices[left] + prices[right];
            if (sum == targetSum) {
                result.add(prices[left]);
                result.add(prices[right]);
                break;
            } else if (sum > targetSum) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }

    // Method to determine if two kangaroos will land on the same position
    static void willKangaroosMeet(int x1, int x2, int v1, int v2) {
        if (x1 == x2) {
            System.out.println("YES");
            return;
        }
        if (v1 == v2) {
            System.out.println("NO");
            return;
        }
        if ((x2 - x1) % (v1 - v2) == 0 && (x2 - x1) / (v1 - v2) > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        int prices[] = {1, 3, 4, 5, 6};
        ArrayList<Integer> iceCreamPair = findIceCreamPair(6, prices);
        System.out.println("Ice cream pair: " + iceCreamPair);

        willKangaroosMeet(0, 4, 3, 2);
    }
}