package leetcode;
/*
    https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class _977_Squares_of_a_Sorted_Array {
    public int[] sortedSquares(int[] nums) {
        if(nums.length==1){
            nums[0] =nums[0]*nums[0];
            return nums;
        }
        int l =0;
        int r =nums.length-1;
        int [] res = new int[nums.length];
        for(int i=r; i>=0;i--){
            int ll = nums[l]*nums[l];
            int rr = nums[r]*nums[r];
            if(ll>rr){
                res[i] =ll;
                l++;
            }else{
                res[i] = rr;
                r--;
            }
        }
        return res;
    }
}
