package leetcode;
/*
    https://leetcode.com/problems/binary-search/
 */
public class _704_Binary_Search {
    public int search(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        while (left<right){
            int mid = (left+right)>>1;
            if(nums[mid] ==target) return mid;
            if(nums[mid]> target){
                right =mid;
            }else{
                left =mid;
            }
        }
        return  -1;
    }
}
