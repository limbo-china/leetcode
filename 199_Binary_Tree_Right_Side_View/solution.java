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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Integer> res = new ArrayList<Integer>();
        if(root != null) queue.offer(root);
        int size = queue.size();
        while(size != 0){
            while(size != 0){
                TreeNode t = queue.poll();
                
                if(size == 1) res.add(t.val);
                if(t.left != null) queue.offer(t.left);
                if(t.right != null) queue.offer(t.right);
                size --;
            }
            size = queue.size();
        }
        return  res;
    }
}