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
    public boolean isValidBST(TreeNode root) {
        
        List<Integer> list = new LinkedList<>();

        helper(root,list);

        boolean isBst = true;
        int prev = list.get(0);
        for(int i=1;i<list.size();i++){

            if(list.get(i) <= prev){
                isBst = false;
            }
            prev = list.get(i);
        }
        return isBst;
    }
    public void helper(TreeNode root, List<Integer> list){

        if(root == null){
            return;
        }

        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
    }
}
