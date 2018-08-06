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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<Double> res = new ArrayList<Double>();
        if(root != null) queue.offer(root);
        int size = queue.size();
        while(size != 0){
            double sum = 0;
            int num = size;
            while(size != 0){
                TreeNode t = queue.poll();
                sum += t.val;
                if(t.left != null) queue.offer(t.left);
                if(t.right != null) queue.offer(t.right);
                size --;
            }
            res.add((double)sum/num);
            size = queue.size();
        }
        return res;
    }
}