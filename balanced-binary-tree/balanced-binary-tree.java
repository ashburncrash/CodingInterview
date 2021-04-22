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
    // top-down approach; calc depth till the leaves -> o(n^2)
//     public boolean isBalanced(TreeNode root) {
//         if (root == null) return true;
        
//         return Math.abs(calcDepth(root.left)  - calcDepth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
//     }
    
//     public int calcDepth(TreeNode root) {
//         if (root == null) return 0;
        
//         return Math.max(calcDepth(root.left) + 1, calcDepth(root.right) + 1);
//     }
    
    // bottom top approach
    // o(n)
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        
        return checkDepth(root) != -1;
    }
    
    public int checkDepth(TreeNode root) {
        if (root == null) return 0;
        
        int left = checkDepth(root.left);
        int right = checkDepth(root.right);
        // check left and right
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) return -1;
        
        return Math.max(left, right) + 1;
    }
}