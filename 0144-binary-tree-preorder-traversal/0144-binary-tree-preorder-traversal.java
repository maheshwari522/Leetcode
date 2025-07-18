/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val; *         this.left = left; *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
       
         preOrderT(res,root);
  
        return res;
    }

    public void preOrderT(List<Integer> res,TreeNode current){
        if(current == null){
            return;
        }
        res.add(current.val);
        preOrderT(res,current.left);
        preOrderT(res,current.right);
    }
}