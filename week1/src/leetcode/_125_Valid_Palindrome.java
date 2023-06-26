package leetcode;

import java.util.ArrayList;
import java.util.List;

/*
    https://leetcode.com/problems/valid-palindrome/description/
 */
public class _125_Valid_Palindrome {

    /*
        核心不是篩選出小寫英文字母
        核心是篩選完之後的判斷
     */
    public boolean isPalindrome(String s) {
        if(s=="") return true;
        List<Character> tmp = new ArrayList<>();
        for (Character c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                tmp.add(Character.toLowerCase(c));
            }
        }
        return check(tmp);

    }
    /*
        利用左右指針
     */
    private boolean check(List<Character> list){
        int left =0;
        int right =list.size()-1;
        while (left<right){
            if(list.get(left)!=list.get(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
