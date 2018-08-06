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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root != null) stack1.push(root);
        int level = 1;
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            List<Integer> list = new ArrayList<Integer>();
            Stack<TreeNode> outstack = (level % 2 != 0) ? stack1 : stack2;
            Stack<TreeNode> instack = (level % 2 != 0) ? stack2 : stack1;
            while(!outstack.isEmpty()){
                TreeNode t = outstack.pop();
                list.add(t.val);
                TreeNode t1 =  (level % 2 == 0) ? t.right : t.left;
                TreeNode t2 =  (level % 2 == 0) ? t.left : t.right;
                if(t1 != null) instack.push(t1);
                if(t2 != null) instack.push(t2);
            }
            res.add(list);
            level += 1;
        }
        return  res;
    }
}