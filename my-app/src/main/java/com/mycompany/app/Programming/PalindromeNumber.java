package com.mycompany.app.Programming;

public class PalindromeNumber {
    //This method uses the two pointer technique
    public static void main(String args[]){
        int x = 1231;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        String xString = x+"";
        //this algorithm is O(n)
        for (int i = 0,j = xString.length() - 1 ; i < xString.length(); i++,j--){
            if(xString.charAt(i) != xString.charAt(j)) return false;
            
        }
        return true;
    }
}
