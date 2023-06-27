package leetcode;

/*
    https://leetcode.com/problems/longest-palindrome/
 */
public class _409_Longest_Palindrome {
    public int longestPalindrome(String s) {
        int odd =0;
        int even =0;
        int[] letters = new int[52];
        for (char c:s.toCharArray()){
            if(Character.isLowerCase(c)){
                letters[ c -'a'] ++;
            }else {
                letters[ c -'A'+26] ++;
            }

        }
        for (int i :letters){
            if(odd==0&&i%2==1){
                odd++;//odd =1
            }
            even += i/2;
        }
        return 2*even+odd;

    }
}
