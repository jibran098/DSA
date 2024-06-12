package codingninjas.recursion;

import java.util.Arrays;

public class CheckPalindrome {
    public static void main(String[] args) {
        boolean result = checkPalindrome("abacba"); //abcaba
        System.out.println(result);
    }
    private static boolean checkPalindrome(String s) {
        //base case
        if(s.length() == 0) {
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length()-1)) {
            return checkPalindrome(s.substring(1,s.length()-1));
        }
    return false;
    }

}
