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
    public static void main(String[] args) {
    num("AABABB");
        
    }
    
}
