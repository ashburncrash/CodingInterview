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
    public int kthSmallest(TreeNode root, int k) {
        // in-order traversal
        if (root == null || k < 1) return -1;
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        inorder(root, k, maxHeap);
        
        return maxHeap.peek();
    }
    
    // left -> current -> right
    public void inorder (TreeNode root, int k, PriorityQueue<Integer> maxHeap) {
        if (root == null) return;
        
        inorder(root.left, k, maxHeap);
        
        maxHeap.add(root.val);
        if(maxHeap.size() > k) {
            maxHeap.remove();
        }
        
        inorder(root.right, k, maxHeap);
    }
}