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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for (Integer i : preorder) {
            root = insert(root, i);
        }
        return root;
//         if (preorder.length == 0) return null;
        
//         // first elem is root
//         TreeNode root = new TreeNode(preorder[0]);
//         root.left = new TreeNode(preorder[1]);
        
//         int i = 2;
        
//         while (root.val > preorder[i] && i < preorder.length) {
//             if (preorder[i] < root.left.val) {
//                 root.left.left = preorder[i];
//             }
//             if (preorder[i] > root.left.val) {
//                 root.left.right = preorder[i];
//             }
//             i++;
//         }
        
//         root.right = new TreeNode(preorder[i]);
        
//         while (root.val < preorder[i] && i < preorder.length) {
//             if (preorder[i] < root.right.val) {
//                 root.right.left = preorder[i];
//             }
//             if (preorder[i] > root.right.val) {
//                 root.right.right = preorder[i];
//             }
//             i++;
//         }
    }
    
    public TreeNode insert(TreeNode root, int val) {
        TreeNode node = new TreeNode(val);
        if (root == null) {
            return node;
        }
        
        TreeNode curr = root;
        
        while (true) {
            if (curr.val > val) {
                if (curr.left == null) {
                    curr.left = new TreeNode(val);
                    return root;
                }
                curr = curr.left;
            }

            if (curr.val < val) {
                if (curr.right == null) {
                    curr.right = new TreeNode(val);
                    return root;
                }

                curr = curr.right;
            }
        }
    }
    
    
    
    
    
    
    
}