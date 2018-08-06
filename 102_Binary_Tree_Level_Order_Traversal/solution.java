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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        levelOrder(root, res, 0);
        return res;
    }
    private void levelOrder(TreeNode root, List<List<Integer>> res, int level){
        if(root == null) return ;
        if(level+1 > res.size()){
            List<Integer> list = new ArrayList<Integer>();
            list.add(root.val);
            res.add(list);
        }else
            res.get(level).add(root.val);
        levelOrder(root.left, res, level+1);
        levelOrder(root.right, res, level+1);
    }
}