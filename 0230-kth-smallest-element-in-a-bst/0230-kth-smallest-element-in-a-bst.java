/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;e *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> l = new ArrayList<>();
    int index = 0;
    public int kthSmallest(TreeNode root, int k) {
        index = k;
        return getL(root);
        
    }

    public int getL(TreeNode root){
        if(root == null) return -1;
        int left = getL(root.left);
        if(left!=-1){
            return left;
        }
        l.add(root.val);
        if(l.size() == index)
        return l.get(index-1);

        return getL(root.right);

    }

}