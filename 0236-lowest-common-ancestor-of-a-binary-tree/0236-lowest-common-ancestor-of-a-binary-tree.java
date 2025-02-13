/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

       //if root is null or if p is the root or q is the root return it
        if(root == null || root == p|| root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left,p,q);
        TreeNode right = lowestCommonAncestor(root.right,p,q);

        //if not found in left return right
        if(left == null){
            return right;
        }else if(right == null){ //if not found in right return left
            return left;
        }else{ //else both are found left and right are not null then root is the lca
            return root;
        }
        
    }
}