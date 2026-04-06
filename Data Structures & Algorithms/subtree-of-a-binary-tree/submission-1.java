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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        String parentTree = preOrderTraversal(root);
        String childTree = preOrderTraversal(subRoot);

        return parentTree.contains(childTree);
    }

    public String preOrderTraversal(TreeNode root){

        if(root == null){
            return "#"; //-> to avoid serilization
        }

        StringBuilder sb = new StringBuilder("*"); //-> to avoid serialization

        sb.append(root.val);
        sb.append(preOrderTraversal(root.left));
        sb.append(preOrderTraversal(root.right));
        return sb.toString();
    }
}
