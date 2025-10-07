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
    TreeNode pre = null;
    int diff = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {

      if(root == null) return 0;

         solve(root);
         return diff;
    
        
    }

    public void solve(TreeNode root){
        if(root == null) return;
        solve(root.left);
        if(pre!=null){
            diff = Math.min(Math.abs(pre.val - root.val),diff);
        }

        pre = root;

        solve(root.right);


    }
}