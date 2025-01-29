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
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        

       return buildTree(inorder,0, inorder.length -1 ,postorder,0,postorder.length-1);
        
    }

    public TreeNode buildTree(int[] inorder,int instart, int inend ,int[] postorder,int poststart, int postend){

        if(instart>inend|| poststart>postend){
            return null;
        }
        int rootval = postorder[postend];
        TreeNode root = new TreeNode(rootval);

        int rootIndex = 0;

        for(int i=instart;i<=inend;i++){
            if(inorder[i] == rootval){
                rootIndex = i;
                break;
            }
        }

            int leftsize= rootIndex -instart;
            int rightsize = inend- rootIndex;

            root.left = buildTree(inorder,instart, rootIndex -1 ,postorder,poststart,poststart+leftsize-1);
        root.right = buildTree(inorder,rootIndex+1, inend ,postorder,postend-rightsize,postend-1);

        return root;
        }
    
}