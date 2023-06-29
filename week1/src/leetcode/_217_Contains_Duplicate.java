package leetcode;

import java.util.HashMap;
import java.util.Map;

/*
    https://leetcode.com/problems/contains-duplicate/
 */
public class _217_Contains_Duplicate {
    /*
        time complexity : O(n)
     */
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                return true;
            }else {
                map.put(i,0);
            }
        }
        return false;
    }
}
