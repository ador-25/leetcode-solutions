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
    public List<Integer> preorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        visitPreOrder(root);
        return result;
    }

    public void visitPreOrder(TreeNode root){
        if (root ==null){
            return;
        }
        result.add(root.val);
        if (root.left!=null){
            visitPreOrder(root.left);
        }
        if (root.right!=null){
            visitPreOrder(root.right);
        }
    }
}