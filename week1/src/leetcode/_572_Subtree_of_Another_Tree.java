package leetcode;
/*
    https://leetcode.com/problems/subtree-of-another-tree/
 */

public class _572_Subtree_of_Another_Tree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot ==null){
            return  true;
        }
        if(root==null){
            return false;
        }
        if(root.val ==subRoot.val){
            if(recursion(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot) ||  isSubtree(root.right,subRoot);
    }
    private boolean recursion(TreeNode root, TreeNode subRoot){
        if(root==null && subRoot ==null){
            return true;
        }
        if(root==null || subRoot ==null){
            return false;
        }
        if(root.val!= subRoot.val){
            return false;
        }else {
            return recursion(root.left,subRoot.left) && recursion(root.right,subRoot.right);
        }
    }
}
