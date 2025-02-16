package cw;

public class A {
    // Method to calculate the minimum number of days to meet the food requirement
    static void q1(int requiredDays, int unit, int[] foodArray, int n) {
        if (foodArray.length == 0) {
            System.out.println("-1");
            return;
        }
        int foodRequirement = requiredDays * unit;
        int food = 0, days = 0;
        for (int i = 0; i < n; i++) {
            if (food <= foodRequirement) {
                food += foodArray[i];
                days++;
            } else {
                break;
            }
        }
        if (food < foodRequirement) {
            System.out.println("0");
        } else {
            System.out.println(days);
        }
    }

    // Method to move all '#' characters to the beginning of the string
    static void print(String s, int n) {
        int hashCount = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '#') {
                hashCount++;
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < hashCount; i++) {
            sb.append("#");
        }

        String s1 = s.replace("#", "");
        sb.append(s1);
        System.out.println(sb);
    }

    // Method to calculate the maximum profit from buying and selling stock
    static void profit(int[] prices, int n) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < n; i++) {
            if (prices[i] > minPrice) {
                maxProfit = Math.max(prices[i] - minPrice, maxProfit);
            } else {
                minPrice = prices[i];
            }
        }
        System.out.println(maxProfit);
    }

    public static void main(String[] args) {
        // Example usage of q1 method
        // int r = 7;
        // int unit = 2;
        // int[] arr = {2, 8, 3, 5, 7, 4, 1, 2};
        // int n = arr.length;
        // q1(r, unit, arr, n);

        // Example usage of print method
        // String s = "#abc#d#dev";
        // int n = s.length();
        // print(s, n);

        // Example usage of profit method
        int[] prices = {7, 1, 5, 3, 6, 4};
        // int[] prices = {7, 6, 4, 3, 1};
        int n = prices.length;
        profit(prices, n);
    }
}