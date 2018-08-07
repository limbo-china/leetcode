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
    public List<Integer> postorderTraversal(TreeNode root) {   
        
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();  
        do{
            while(root != null){
                res.add(0, root.val);
                stack.push(root);
                root = root.right;
            }
            if(stack.isEmpty()) break;
            root = stack.pop();
            root = root.left;        
        }while(true);
        
        return res;
        
    }
}