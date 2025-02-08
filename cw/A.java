package cw;

public class A {
    static void q1(int r,int unit,int arr[],int n){
        if(arr.length==0){
            System.out.println("-1");
            return;
        }
        int foodreq=r*unit;
        int food=0,c=0;
        for(int i=0;i<n;i++){
            if(food<=foodreq){
                food+=arr[i];
                c++;
            }
            else{
                break;
            }
           
            }
            if(food<foodreq){
                System.out.println("0");
            }
            else{
                System.out.println(c);
            }
    }
    static void print(String s,int n){
        int c=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='#'){
                c++;
            }
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<c;i++){
            sb.append("#");
        }

        String s1=s.replace("#","");
        sb.append(s1);
        System.out.println(sb);
    }
    static void profit(int price[],int n){
        int profit=0;
        int bd=price[0];
        for(int i=1;i<n;i++){
           if(price[i]>bd){
                profit=Math.max(price[i]-bd,profit);
           }else{
                bd=price[i];
           }
        }
        System.out.println(profit);
    }

    public static void main(String[] args) {
        // int r=7;
        // int unit=2;
        // int arr[]={2,8,3,5,7,4,1,2};
        // int n=arr.length;
        // q1(r,unit,arr,n);
        // String s="#abc#d#dev";
        // int n=s.length();
        // print(s,n);
        int a[]={7,1,5,3,6,4};
        // int a[]={7,6,4,3,1};
        int n=a.length;
        profit(a,n);
        
         
    }
    
}
