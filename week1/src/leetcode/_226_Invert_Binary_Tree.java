package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/*
    https://leetcode.com/problems/invert-binary-tree/
 */
public class _226_Invert_Binary_Tree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
    }
    /*
        思路:遍例樹之後做操作
        利用前中後or層序遍例 後 進行操作
        這邊要翻轉二元樹 因此操作為左右子樹的交換
     */
    public TreeNode invertTree_DLR(TreeNode root) {
        if(root==null) return root;
        TreeNode tmp = root.left;
        root.left =root.right;
        root.right =tmp;
        invertTree_DLR(root.left);
        invertTree_DLR(root.right);
        return root;
    }
    /*
        中序遍例
     */
    public TreeNode invertTree_LDR(TreeNode root) {
        if(root==null) return root;
        invertTree_LDR(root.left);
        TreeNode tmp = root.left;
        root.left =root.right;
        root.right =tmp;
        //因為這邊先指定交換了左右子樹 因此接下來要操作的還要視左子樹
        invertTree_LDR(root.left);
        return root;
    }
    /*
        後序遍例
     */
    public TreeNode invertTree_LRD(TreeNode root) {
        if(root==null) return root;
        invertTree_LRD(root.left);
        invertTree_LRD(root.right);
        TreeNode tmp = root.left;
        root.left =root.right;
        root.right =tmp;
        return root;
    }
    /*
        層序遍例
        利用queue暫存
     */
    public TreeNode invertTree_level(TreeNode root) {
        if(root ==null) return root;
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode n = queue.poll();
            TreeNode tmp = n.left;
            n.left = n.right;
            n.right =tmp;
            if(n.left!=null){
                queue.offer(n.left);
            }
            if(n.right!=null){
                queue.offer(n.right);
            }
        }
        return root;
    }
}
