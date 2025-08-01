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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return res;
        q.add(root);
        while(!q.isEmpty()){
            TreeNode rightside = null;
            int qsize = q.size();
            for(int i=0;i<qsize;i++){
                TreeNode current = q.poll();
                if(current!=null){
                    rightside= current;
                }
                if(current.left != null) q.add(current.left);
                if(current.right != null) q.add(current.right);
            }
            if(rightside!=null){
                res.add(rightside.val);
            }
        }

        return res;
    
        
    }
}