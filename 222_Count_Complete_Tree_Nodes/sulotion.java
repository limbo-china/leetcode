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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        
        if(left==right)
            return (1 << left) + countNodes(root.right);
        else
            return (1 << right) + countNodes(root.left); 
    }
    
    private int height(TreeNode t){
        if(t==null) return 0;
        return 1 + height(t.left);
    }
}