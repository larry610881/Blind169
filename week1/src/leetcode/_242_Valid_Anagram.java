package leetcode;

import java.util.HashMap;
import java.util.Map;

/*
    https://leetcode.com/problems/valid-anagram/
 */
public class _242_Valid_Anagram {
    /*
        搞不定只好抄別人的
        利用轉ASCII 用a當作index0去紀錄每一個值分別有幾個
        一個++ 一個-- 如果數量相等的話則會為0
        然後遍歷26次判斷值是否為0

        好猛
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
