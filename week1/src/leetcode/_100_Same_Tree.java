package leetcode;
/*
    https://leetcode.com/problems/same-tree/
 */
public class _100_Same_Tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q==null || p ==null) return p==q;
        return p.val ==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
