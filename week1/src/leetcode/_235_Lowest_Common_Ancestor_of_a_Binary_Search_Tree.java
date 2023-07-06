package leetcode;
/*
    https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class _235_Lowest_Common_Ancestor_of_a_Binary_Search_Tree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val>p.val && root.val > q.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(root.val< p.val && root.val< q.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
}
