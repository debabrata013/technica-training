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
    static void timeconverter(String t){
      char c=t.charAt(t.length()-2);
      String arr[]=t.split(":");
  
      StringBuilder a=new   StringBuilder();
      if(c=='A'||c=='a'){
       
        if(arr[0]=="12") a.append("00:");
        else a.append(arr[0]+":");
        a.append(arr[1]+":");
        a.append(arr[2]);
        a.deleteCharAt(a.length()-1);
        a.deleteCharAt(a.length()-1);


      }else{
        if(arr[0].equals("12")) a.append("12:");
        else a.append((Integer.parseInt(arr[0])+12)+":");
        a.append(arr[1]+":");
        a.append(arr[2]);
        a.deleteCharAt(a.length()-1);
        a.deleteCharAt(a.length()-1);
      }
      System.out.println(a);

    }
    static void digonalDifference(int arr[][]){
        int n=arr.length;
        int s1=0,s2=0;
        for(int i=0;i<n;i++){
            s1+=arr[i][i];
            s2+=arr[i][n-i-1];
        }
        System.out.println(Math.abs(s1-s2));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int k=sc.nextInt();
        // int arr[]=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // angryProfesher(n,k,arr);
        // timeconverter("10:00:00pM");
        int arr[][]={{11,2,4},{4,5,6},{10,8,-12}};
        digonalDifference(arr);

    }
}