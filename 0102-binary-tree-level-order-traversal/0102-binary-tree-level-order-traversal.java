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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> res= new ArrayList<>();

        if(root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){

            int qsize = q.size();
            
            List<Integer> level = new ArrayList<>();
            

            for(int i=0;i<qsize;i++){
                TreeNode current = q.poll();

                level.add(current.val);

                if(current.left != null) q.add(current.left);
                if(current.right != null) q.add(current.right);
            }

            res.add(level);
        }

        
      return res;  
    }
}