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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root == null) return result;
        
        findPaths(root, result, "");
        
        return result;
    }
    
    public void findPaths(TreeNode root, List<String> result, String s) {
        s += root.val;
        
        if(root.left == null && root.right == null) {
            result.add(s);
            return;
        }
        
        if(root.left != null) {
            findPaths(root.left, result, s+"->");
        }
        
        if(root.right != null) {
            findPaths(root.right, result, s+"->");
        }
    }
}