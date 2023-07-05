package leetcode;
/*
    https://leetcode.com/problems/maximum-subarray/
 */
public class _53_Maximum_Subarray {
    /*
        利用Sliding Window解決問題
     */
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum =0;
        int left=0;
        for(int right =0;right<nums.length;right++){
            currentSum+=nums[right];
            maxSum =Math.max(maxSum,currentSum);
            if(currentSum<0){
                currentSum=0;
                left = right+1;
            }
        }
        return maxSum;
    }
    /*
        利用Sliding Window解決問題 並省略一個flag
     */
    public int maxSubArray1(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum =0;
        for(int i :nums){
            currentSum+=i;
            maxSum =Math.max(maxSum,currentSum);
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
}
