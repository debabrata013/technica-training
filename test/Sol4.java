package test;
import java.util.*;

public class Sol4 {
    static Scanner sc = new Scanner(System.in);
    public static void median(){
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
       Arrays.sort(arr);
       if(n%2==0){
           System.out.println((arr[n/2]+arr[(n/2)-1])/2);
       }else{
           System.out.println(arr[n/2]);
       }

    }
    

    public static void main(String[] args) {
        
    }
    
}
