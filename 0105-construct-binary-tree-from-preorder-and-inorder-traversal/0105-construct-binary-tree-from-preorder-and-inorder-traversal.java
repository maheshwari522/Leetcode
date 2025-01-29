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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
//hashmap for storing inorder tree index
        HashMap<Integer,Integer> inMap = new HashMap<>();

        for(int i=0;i<inorder.length;i++){

            inMap.put(inorder[i],i);

        }

//recursive call
 TreeNode root  =buildTree(preorder, 0,  preorder.length-1,  inorder,  0, inorder.length-1, inMap );

 return root;

        
    }

    public TreeNode buildTree(int[] preorder, int prestart, int preend, int[] inorder, int instart,int inend, HashMap<Integer,Integer> inMap ){
//return when reach leaf
        if(prestart>preend || instart>inend) return null;
//root will be the first node of the preorder
        TreeNode root = new TreeNode(preorder[prestart]);

//find the inorder root index

        int inroot = inMap.get(root.val);
//nums at left in the tree 
        int numsleft = inroot-instart;
//call the left subtree recusrion
//here pass preorder, prestart+1, preend upto left , instart fro 0, end upro root element
        root.left = buildTree(preorder, prestart+1,  prestart+numsleft,  inorder,  instart, inroot-1, inMap );
//give the roght side in both tree
        root.right =buildTree(preorder, prestart+numsleft+1,  preend,  inorder,  inroot+1, inend, inMap );

return root;

    }
}