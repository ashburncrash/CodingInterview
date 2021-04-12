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
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        // list per level
        List<List<Integer>> result = new ArrayList<>();
        
        if (root == null) return result;
        
        // bfs - need queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size(); // get size here so that the queue gets the size per level
        // using queue.size() directly on the for loop will take the new change in to consideration..   
        
            for (int i = 0; i < size; i++) { // loop through nodes per level
                TreeNode curr = queue.remove();
                level.add(curr.val);

                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            
            result.add(level);
        }
        
        
        return result;
    }
}