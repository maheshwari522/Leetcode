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

    int dia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
       

        helper(root);
        return dia;


    }

    public int helper(TreeNode root){
        if(root == null)return 0;

        int lh = helper(root.left);
        int rh = helper(root.right);

        int currentDia = lh+rh;

        dia = Math.max(currentDia,dia);

        return Math.max(lh,rh)+1;

    }



}