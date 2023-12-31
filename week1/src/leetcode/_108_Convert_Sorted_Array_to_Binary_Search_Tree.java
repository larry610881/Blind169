package leetcode;

/*
    https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */
public class _108_Convert_Sorted_Array_to_Binary_Search_Tree {
    public TreeNode sortedArrayToBST(int[] nums) {
            return buildTree(nums,0,nums.length-1);
    }
    private TreeNode buildTree(int[] nums,int start,int end){
        if(start>end){
            return null;
        }
        int mid = start +(end-start)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums,start,mid-1);
        root.right = buildTree(nums,mid+1,end);
        return root;
    }
}
