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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int maxLevel = 1;
        int maxSum = root.val;
        int currentLevel = 1;

        while(!queue.isEmpty()) {
            int size = queue.size();
            int tempSum = 0;

            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                
                if(node.right != null){
                    queue.offer(node.right);
                }
                if(node.left != null) {
                    queue.offer(node.left);
                }
                tempSum += node.val;
            }
            
            if(tempSum > maxSum){
                maxSum = tempSum;
                maxLevel = currentLevel;
            }

            currentLevel++;
        }

        return maxLevel;
    }
}