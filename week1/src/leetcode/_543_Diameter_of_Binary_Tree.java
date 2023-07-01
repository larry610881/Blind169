package leetcode;
/*
    https://leetcode.com/problems/diameter-of-binary-tree/
 */
public class _543_Diameter_of_Binary_Tree {
    /*
        可能出現最高的位置為
        1.左子樹的樹高+右子樹樹高
        2.左、右子樹的左右節點分別很多 自成最高

        解法:找1.左height+右height 以及 左子樹的最大值 和右子樹的最大值 做遞迴
     */
    public int diameterOfBinaryTree(TreeNode root) {
        if(root ==null) return 0;
        int left =height(root.left);
        int right =height(root.right);
        int leftMax =diameterOfBinaryTree(root.left);
        int rightMax =diameterOfBinaryTree(root.right);
        return Math.max(left+right,Math.max(leftMax,rightMax)) ;
    }
    private int height(TreeNode node){
        if(node ==null) return 0;
        return Math.max(height(node.left),height(node.right))+1;
    }
}
