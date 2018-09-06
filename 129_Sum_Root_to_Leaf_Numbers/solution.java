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
    private int sum = 0;
    
    public int sumNumbers(TreeNode root) {  
        sum = 0;
        dfs(root,0);
        return sum;
    }
    
    private void dfs(TreeNode root, int current){
        if(root == null) return ;
        current = current*10 + root.val;
        if(root.left == null && root.right == null ) sum += current;
        
        dfs(root.left, current);
        dfs(root.right, current);  
    }
}