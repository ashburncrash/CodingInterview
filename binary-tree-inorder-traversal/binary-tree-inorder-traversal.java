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
    List<Integer> result = new ArrayList<>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        // in order traversal -> left root right
        if (root == null) return result;
        
        if (root.left != null) {
            inorderTraversal(root.left);
        }
        if (root != null) {
            result.add(root.val);
        }
        if (root.right != null) {
            inorderTraversal(root.right);
        }
        
        return result;
    }
}