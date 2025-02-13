package cw;
import java.util.*;
class C{
    static ArrayList<Integer> icecrem(int c,int spt[]){
        ArrayList<Integer> ans=new ArrayList<>();
        int l=0,r=spt.length-1;
        Arrays.sort(spt);
        while(l<=r){
            int sum=spt[l]+spt[r];
            if(sum==c){
                ans.add(spt[l]);
                ans.add(spt[r]);
                break;
            }
            else if(sum>c){
                r--;
            }
            else{
                l++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6};
        ArrayList<Integer> ans=icecrem(6,arr);
        System.out.println(ans);

    }
}
