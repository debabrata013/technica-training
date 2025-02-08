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
    
    public static void main(String[] args) {
        // int r=7;
        // int unit=2;
        // int arr[]={2,8,3,5,7,4,1,2};
        // int n=arr.length;
        // q1(r,unit,arr,n);
        String s="#abc#d#dev";
        int n=s.length();
        print(s,n);
         
    }
    
}
