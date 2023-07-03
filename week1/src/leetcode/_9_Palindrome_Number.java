package leetcode;
/*
    https://leetcode.com/problems/palindrome-number/
 */
public class _9_Palindrome_Number {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String xs = String.valueOf(x);
        int l =0;
        int r =xs.length()-1;
        while (l<r){
            if(xs.charAt(l) != xs.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
