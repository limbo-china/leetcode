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
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        traversal(root, res);
        return res;
    }
    private void traversal(TreeNode root, List<Integer> res){
        if(root == null) return;
        traversal(root.left, res);
        res.add(root.val);
        traversal(root.right, res);
    }
}