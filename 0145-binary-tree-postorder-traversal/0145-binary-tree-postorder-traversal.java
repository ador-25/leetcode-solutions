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
    public List<Integer> postorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        visitPostOrder(root);
        return result;

    }
    public void visitPostOrder(TreeNode root){
        if (root ==null){
            return;
        }
        if (root.left!=null){
            visitPostOrder(root.left);
        }
        if (root.right!=null){
            visitPostOrder(root.right);
        }
        result.add(root.val);
    }
}