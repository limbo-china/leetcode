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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> solu = new ArrayList<Integer>();
        dfs(root, res, solu, sum, 0);
        return res;
    }
    
    private void dfs(TreeNode root, List<List<Integer>> res, List<Integer> solu, int sum, int current){
        if(root == null ) return ;
        current = current + root.val;
        
        solu.add(root.val);
        if(root.left == null && root.right == null && current == sum){
            res.add(new ArrayList<Integer>(solu));
            solu.remove(solu.size()-1);
            return ;
        }
        dfs(root.left, res, solu, sum, current);
        dfs(root.right, res, solu, sum, current);
        
        solu.remove(solu.size()-1);
    }
}