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
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }

    int helper(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftMax = Math.max(0, helper(root.left));
        int rightMax = Math.max(0, helper(root.right));

        ans = Math.max(ans,root.val+leftMax+rightMax);
        return root.val + Math.max(leftMax,rightMax);
    }
}
