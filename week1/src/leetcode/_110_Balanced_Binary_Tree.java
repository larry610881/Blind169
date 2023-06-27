package leetcode;
/*
    https://leetcode.com/problems/balanced-binary-tree/
 */
public class _110_Balanced_Binary_Tree {

    /*
        Worst Case :
        time complexity :O(nlogn)
     */
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left_height =height(root.left);
        int right_height =height(root.right);
        return (Math.abs(left_height-right_height)<=1 && isBalanced(root.left) && isBalanced(root.right));
    }
    private int height(TreeNode node){
        if (node ==null)return 0;
        return Math.max(height(node.left),height(node.right))+1;
    }
    public boolean isBalanced1(TreeNode root) {
        if(root==null) return true;
        if(height1(root) ==-1) return false;
        return  true;
    }
    private int height1(TreeNode node) {
        if(node ==null) return 0;
        int left_height =height1(node.left);
        int right_height =height1(node.right);
        if(Math.abs(left_height-right_height)>1)return -1;
        if(left_height==-1 ||right_height ==-1) return -1;
        return Math.max(left_height,right_height)+1;
    }


}
