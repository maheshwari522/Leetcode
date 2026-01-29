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
 //TC:O(n)
 //SC:O(h)
class Solution {
    Integer result;
    int count;
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root,k);

        return result;


    }
    private void inOrder(TreeNode root,int k){
        if(root == null) return;
        if(result != null) return;
        
        
        inOrder(root.left,k);
        count++;
        
        if(k==count){
            result = root.val;
            
        }
        inOrder(root.right,k);
    }
}