package cw;

import java.util.Scanner;

class E{
    static void angryProfesher(int n,int k,int arr[]){
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=0){
                sum++;
            }
        }
        if(sum>=k){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        angryProfesher(n,k,arr);

    }
}