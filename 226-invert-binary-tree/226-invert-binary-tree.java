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
    public TreeNode invertTree(TreeNode root) {
        return dfs(root);
    }
    
    private TreeNode dfs(TreeNode node) {
        if (node == null) return node;
        
        if (node.left != null || node.right != null) {
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
        
        dfs(node.left);
        dfs(node.right);
        
        return node;
    }
}