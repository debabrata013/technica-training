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

    static void maxBird(){
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      
        Arrays.sort(arr);
        int max=0; int count=0;int ele=arr[0];
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }else{
                count=0;
            }
            if(count>max){
                max=count;
                ele=arr[i];
            }
        }
        System.out.println(ele);
    }
    static void minimumloss(){
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]&& arr[i]-arr[j]<min){
                    min=arr[i]-arr[j];
                }
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        median();
        maxBird();
        minimumloss();
    }
    
}
