package cw;
class E{
    static void angryProfesher(int n,int k,int arr[]){
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=0){
                sum++;
            }
        }
        if(sum>=k){
            System.out.println("No , don't cancle the class");
        }
        else{
            System.out.println("Yes, cancle the class");
        }
    }
    public static void main(String[] args) {
        int n=5;
        int k=3;
        int arr[]={-1,2,1,-3,4};
        angryProfesher(n,k,arr);

    }
}