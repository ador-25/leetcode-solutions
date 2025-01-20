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
    public int maxDepth(TreeNode root) {
        return dfs(root);
    }
    public int dfs(TreeNode node){
        if (node ==null)
            return 0;
        if (node.left==null && node.right==null){
            return 1;
        }
        int left = 0,right =0;
        if (node.left!=null){
            left = dfs(node.left);
        }

        if (node.right!=null){
            right = dfs(node.right);
        }

        return Math.max(left,right)+1;
    }
}