package cw;

public class D {
    static void num(String s){
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
                count++;
            }
        }
        System.out.println(count);
    }
    static void repetedString(String s,long n){
        long count = 0;
        StringBuilder sb = new StringBuilder();
        while(sb.length()<n){
            sb.append(s);
        }
        while(sb.length()>n){
            sb.deleteCharAt(sb.length()-1);

        }
        
        for( int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
    num("AABABB");
    repetedString("aba", 10);
        
    }
    
}
