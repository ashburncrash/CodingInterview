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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        
        return createBST(nums, 0, nums.length - 1);
    }
    
    public TreeNode createBST(int[] array, int start, int end) {
        if (start > end) return null;
        
        int mid = (start + end) / 2;
        
        TreeNode root = new TreeNode(array[mid]);
        
        root.left = createBST(array, start, mid-1); // left half
        root.right = createBST(array, mid+1, end); // right half
        
        return root;
    }
}