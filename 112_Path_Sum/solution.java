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
    private int flag = 0;
    
    public boolean hasPathSum(TreeNode root, int sum) {
        dfs(root,sum,0);
        return flag == 1;
    }
    private void dfs(TreeNode root, int sum, int current){
        if(root == null || flag == 1) return ;
        if(root.left == null && root.right == null && sum == current + root.val) {
            flag = 1;
            return ;
        }
        
        dfs(root.left, sum, current+root.val);
        dfs(root.right, sum, current+root.val);
    }
}