package test;
import java.util.*;
public class Sol2 {
    public static int q1(int n, int k) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                factors.add(i);
                if (i != n / i) {
                    factors.add(n / i);
                }
            }
        }

        Collections.sort(factors, Collections.reverseOrder());

        if (k > factors.size()) {
            return -1;
        }
        return factors.get(k - 1);
    }
    
    static void q3(int c,int w){
  
        int day=0;
        c+=w/7;
        while(c>0){
            day++;
            w++;
            c--;
            if(w%7==0){
    c++;
                w=w%7;
            }
        }
        System.out.println(day);
    }

    public static void q2(int n) {
        if (n < 2) {
            System.out.println("Not Possible");
            return;
        }
        int size = 2 * n - 1;
        int[][] pattern = new int[size][size];

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

        for (int[] row : pattern) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
System.out.println(q1(12,3));
q3(10,15);
q2(5);
    }
    
}
