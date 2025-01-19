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
    List<Integer> result;
    public List<Integer> inorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        visitInOrder(root);
        return result;
    }

    public void visitInOrder(TreeNode root){
        if (root ==null){
            return;
        }
        if (root.left!=null){
            visitInOrder(root.left);
        }
        result.add(root.val);
        if (root.right!=null){
            visitInOrder(root.right);
        }
    }
}