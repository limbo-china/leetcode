/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {

    TreeNode current = null;
    Stack<TreeNode> stack = new Stack<TreeNode>();
    
    public BSTIterator(TreeNode root) {    
        if(root != null){
            stack.push(root);
            this.current = root.left;
        }
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return current != null || !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        while(current != null){
            stack.push(current);
            current = current.left;
        }
        current = stack.pop();
        int res = current.val;
        current = current.right;
        return res;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */