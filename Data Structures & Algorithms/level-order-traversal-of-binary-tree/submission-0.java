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
    

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> flist = new ArrayList<>();

        if(root == null){
            return flist;
        }

        queue.add(root);
        while(!queue.isEmpty()){

            int eachLevel = queue.size();

            List<Integer> list = new ArrayList<>();

            for(int i=0;i<eachLevel;i++){
                TreeNode node = queue.poll();

                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                list.add(node.val);
            }
            flist.add(list);
        }
        return flist;
    }
}
