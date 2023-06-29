package leetcode;
/*
    https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
 */
public class _104_Maximum_Depth_of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
