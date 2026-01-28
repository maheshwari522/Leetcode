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
    List<TreeNode> pathp;
    List<TreeNode> pathq;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        backtrack(root,p,q,new ArrayList<>());
        for(int i = 0;i<pathp.size();i++){
            if(pathp.get(i)!=pathq.get(i)){
                return pathp.get(i-1);
            }
        }
        return null;

    }
    private void backtrack(TreeNode root, TreeNode p, TreeNode q, List<TreeNode> path){
        if(root == null) return;

        //action
        path.add(root);
        if(root == p){
            pathp=new ArrayList<>(path);
            pathp.add(p);
        }
        if(root == q){
            pathq = new ArrayList<>(path);
            pathq.add(q);
        }

        //recurse
        backtrack(root.left,p,q,path);
        backtrack(root.right,p,q,path);

        //backtrack
        path.remove(path.size()-1);
       

    } 
}