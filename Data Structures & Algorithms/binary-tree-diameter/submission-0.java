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
    public int maxdiameter =0;
    public int diameterOfBinaryTree(TreeNode root) {
        calculateHeight(root);
        return maxdiameter;
    }
    public int calculateHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHeight = calculateHeight(root.left);
        int rightHeight = calculateHeight(root.right);

        maxdiameter = Math.max(maxdiameter, leftHeight + rightHeight);
        return 1+ Math.max(leftHeight, rightHeight);
    }
}
