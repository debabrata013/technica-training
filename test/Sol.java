package test;

import java.util.HashMap;
import java.util.Scanner;

public class Sol{
    static void q1(String a){
        int n=a.length();
       
            // map in java
            HashMap<Character, Integer> map = new HashMap<>();
            for(int i=0;i<n;i++){
                if(map.containsKey(a.charAt(i))){
                    map.put(a.charAt(i), map.get(a.charAt(i))+1);
                }
                else{
                    map.put(a.charAt(i), 1);
                }
            }

int odd=0;
for(int i: map.values()){
    if(i%2!=0){
        odd++;
    }}
    if(odd==0||odd==1){
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
        
    }
}

static void q2(int c,int w){
  
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
static void q3(int []   a){
    int l=0,r=a.length-1;
    int max=0;
    while(l<=r){
        int h=Math.min(a[l], a[r]);
        int w=r-l;
        max=Math.max(max, h*w);
        if(a[l]<a[r]){
            l++;
        }
        else{
            r--;
        }
        }
        System.out.println(max);
}


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string for q1:");
        String s=sc.nextLine();
        System.out.println("Enter the number of chocolate  for q2:");
        int c=sc.nextInt();
        System.out.println("Enter the number of chocolate wraper for q2:");
        int w=sc.nextInt();
        System.out.println("Enter the array  size of array for q3:");
        int n=sc.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the array elements for q3:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }


        q1(s);
        q2(c,w);
        q3(a);

        
    }
}