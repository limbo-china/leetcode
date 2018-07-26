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
        
        return countNodesWithHeight(root, left+1);
        
    }   
    private int countNodesWithHeight(TreeNode root, int h){
        if(h==0 || h==1) return h;
        int left = h-1;
        int right = height(root.right);
        
        if(left==right)
            return (1 << left) + countNodesWithHeight(root.right, right);
        else
            return (1 << right) + countNodesWithHeight(root.left, left); 
    }
    
    private int height(TreeNode t){
        if(t==null) return 0;
        return 1 + height(t.left);
    }
}