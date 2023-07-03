package leetcode;
/*
    https://leetcode.com/problems/symmetric-tree/
 */
public class _101_Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        if(root.left==null && root.right ==null) return true;
        return same(root.left,root.right);
    }
    private boolean same(TreeNode left,TreeNode right){
        if(left==null || right ==null) return left ==right;
        return left.val ==right.val && same(left.left,right.right) && same(left.right,right.left);
    }
}
