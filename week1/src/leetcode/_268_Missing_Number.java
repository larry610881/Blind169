package leetcode;

import java.util.HashMap;

/*
    https://leetcode.com/problems/missing-number/
 */
public class _268_Missing_Number {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<=n;i++){
            map.put(i,i);
        }
        for(int i :nums){
            map.remove((Integer)i);
        }
        return  map.entrySet().iterator().next().getKey();
    }
}
