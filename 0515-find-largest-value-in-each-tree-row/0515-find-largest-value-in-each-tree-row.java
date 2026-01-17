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
    public List<Integer> largestValues(TreeNode root) {
        
        List<Integer> res= new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){
            int qsize = q.size();
            int currentMax = Integer.MIN_VALUE;
            for(int i=0;i<qsize;i++){
                TreeNode current = q.poll();
                currentMax= Math.max(currentMax,current.val);
                if(current.left!=null) q.offer(current.left);
                if(current.right!=null) q.offer(current.right);


            }
            res.add(currentMax);
        }

        return res;


        
    }
}