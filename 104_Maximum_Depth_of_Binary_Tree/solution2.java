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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root != null) queue.offer(root);
        int size = queue.size();
        int depth = 0;
        while(size != 0){
            depth ++;
            while(size != 0){
                TreeNode t = queue.poll();
                if(t.left != null) queue.offer(t.left);
                if(t.right != null) queue.offer(t.right);
                size --;
            }          
            size = queue.size();
        }
       return depth;
    }
}