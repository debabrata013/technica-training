package test;

import java.util.Scanner;

public class Sol3 {
    static int q1(String N){
        if(N.length()==0)return 0;
        int ans=0 ;
        for(int i=0;i<N.length();i++){
            if(N.charAt(i)!='0'){
                ans++;
            }
        }
        return ans ;
    }

    static void q2(int arr[],int x){
        
        for(int i=0;i<arr.length;i++){
           int  sum=i;
            for(int j=i+1;j<arr.length;j++){
                sum+=j;
                if(sum==x){
                    System.out.println("YES");
                    return;
                }
            }

        }
        System.out.println("NO");
    }

    static void q3(int  n){
       
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print(".");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print(".");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the value of N");
        // String n=sc.nextLine();
        // System.out.println("Question 1 output is "+q1(n));
        // System.out.println("Enter the size of the array :");
        // int N=sc.nextInt();
        // int arr[]=new int[N];
        // System.out.println("Enter the elements of the array :");
        // for(int i=0;i<N;i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println("Enter the value of target sum of two elements: ");
        // int x=sc.nextInt();
        // System.out.println("Question 2 output is ");
        // q2(arr,x);
        System.out.println("Enter the value N for printing the trapizodial pattern :");
        int n1=sc.nextInt();
        System.out.println("Question 3 output is ");
        q3(n1);

      
    }
    
}
