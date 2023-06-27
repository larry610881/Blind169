package leetcode;

import java.util.ArrayList;
import java.util.List;

/*
    https://leetcode.com/problems/ransom-note/
 */
public class _383_Ransom_Note {
    /*
        思路:
        ransomNote可以由magazine組成
        因此從char的角度來看 我可以計算他們所有元素的個數
        magazine +1
        ransomNote -1
        當最後所由字元都大於0就代表可以組成

     */
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] tmp = new int[26];
        for (char c : ransomNote.toCharArray()) {
            tmp[c-'a']--;
        }
        for (char c : magazine.toCharArray()) {
            tmp[c-'a']++;
        }
        for(int i :tmp){
            if(i<0) return false;
        }
        return true;
    }
}
