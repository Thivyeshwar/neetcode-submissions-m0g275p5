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
    public boolean isBalanced(TreeNode root) {
        
        if(root == null){
            return true;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        HashMap<TreeNode,Integer> map = new HashMap<>();

        while(!stack.isEmpty()){

            TreeNode node = stack.peek(); 
            if(node.left != null && !map.containsKey(node.left)){
                stack.push(node.left);
            }
            else if(node.right != null && !map.containsKey(node.right)){
                stack.push(node.right);
            }
            else{

                stack.pop();
                int leftLength = map.getOrDefault(node.left,0);
                int rightLength = map.getOrDefault(node.right,0);


               if(Math.abs(leftLength - rightLength) > 1){
                return false;
               }

               map.put(node,1+Math.max(leftLength,rightLength));
            }
        }
        return true;
    }
}
