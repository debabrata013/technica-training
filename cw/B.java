package cw;

import java.util.Scanner;

class B{
    static void maxdisforanycitytoSpacestation(int c,int spt[]){
       
        int m=spt.length;
        int max=0;
        for(int i=0;i<c;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<m;j++){
                min=Math.min(min,Math.abs(i-spt[j]));
            }
            max=Math.max(max,min);
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of city");

        int city=sc.nextInt();
        System.out.println("Enter the no of spacestation");

        int noofspacestation=sc.nextInt();
        int spacestation[]=new int[noofspacestation];
        System.out.println("Enter the spacestation");
        for(int i=0;i<noofspacestation;i++){
            spacestation[i]=sc.nextInt();
        }
        System.out.println("ans is");
        
        maxdisforanycitytoSpacestation(city,spacestation);

        
    }

}