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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null) return result;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        // boolean left = true;
        int depth = 0;
        
        while(!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.remove();
                level.add(current.val);
                
                if (current.left != null) {
                    queue.add(current.left);
                }
                if (current.right != null) {
                    queue.add(current.right);
                }
            }
            
            // if (!left) {
            //     Collections.reverse(level);
            //     left = true;
            // } else {
            //     left = false;
            // }
            // other approach: keep track of depth and reverse for every odd level
            depth++;
            
            if(depth % 2 == 0) {
                Collections.reverse(level);
            }
            
            result.add(level);
        }
        
        return result;
    }
}