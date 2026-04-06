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
    public int goodNodes(TreeNode root) {
        return count(root,Integer.MIN_VALUE);
    }
    public int count(TreeNode node, int maxValue){

        if(node == null){
            return 0;
        }

        int goodNode = 0;
        if(node.val >= maxValue){
            goodNode = 1;
            maxValue = node.val;
        }

        return goodNode + count(node.left,maxValue) + count(node.right,maxValue);
    }
}
