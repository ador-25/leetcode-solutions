/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return traverse(p,q);
    }
    public boolean traverse(TreeNode p,TreeNode q){
        if (p==null && q==null){
            return true;
        }
        if (p==null){
            return false;
        }
        if (q==null){
            return false;
        }
        if (p.val!=q.val){
            return false;
        }
        return traverse(p.left,q.left) && traverse(p.right,q.right);
    }
}