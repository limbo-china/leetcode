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
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root != null) queue.offer(root);
        int size = queue.size();
        while(size != 0){
            List<Integer> list = new ArrayList<Integer>();
            while(size != 0){
                TreeNode t = queue.poll();
                list.add(t.val);
                if(t.left != null) queue.offer(t.left);
                if(t.right != null) queue.offer(t.right);
                size --;
            }
            res.add(list);
            size = queue.size();
        }
        return  res;
    }
}