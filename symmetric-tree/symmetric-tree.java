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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return false;
        
        return checkTree(root.left, root.right);
    }
    
    public boolean checkTree(TreeNode nodeL, TreeNode nodeR) {
        if (nodeL == null || nodeR == null) return nodeL == nodeR;
        
        if (nodeL.val != nodeR.val) return false;
        
        return checkTree(nodeL.left, nodeR.right) && checkTree(nodeL.right, nodeR.left);
    }
}