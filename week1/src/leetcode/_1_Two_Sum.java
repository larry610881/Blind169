package leetcode;

import java.util.HashMap;

/*
    https://leetcode.com/problems/two-sum/
 */
public  class _1_Two_Sum {
    /*
     第一直覺雙層for迴圈
     time complexity: O(n^2)
     */
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    /*
        優化思路:
            雙重迴圈太慢，每個值做遍例之後都會有個差值，如果下一個值等於曾經遍例的值的差值就會是相加等於target
            使用HashMap，key比較好查詢，加上每一個值得差值都會是唯一(nums沒有重複值)因為將key存放差值,
            將value存index

     */
    public static int[] twoSum1(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }else{
                int minus = target-nums[i];
                map.put(minus,i);
            }
        }
        return new int[]{};
    }
}
