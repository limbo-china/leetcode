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
    List<List<TreeNode>> res = new ArrayList<List<TreeNode>>();
    {
        List<TreeNode> n0 = new ArrayList<TreeNode>();
        n0.add(null);
        res.add(n0);
    }
    public List<TreeNode> generateTrees(int n) {
        if(n == 0) return new ArrayList<TreeNode>();
        for(int i=1; i<=n ; i++){  
            List<TreeNode> ni = new ArrayList<TreeNode>();  
            for(int j=1; j<=i;j++){
                for(TreeNode tl: res.get(j-1)){          
                    for(TreeNode tr : res.get(i-j)){
                        TreeNode root = new TreeNode(j);
                        root.left = tl;
                        root.right = cloneWithOffset(tr, j);
                        ni.add(root);
                    }            
                }
            }
            res.add(ni);
        }
        return res.get(n);
    }
    private TreeNode cloneWithOffset(TreeNode root, int offset){
        if (root == null) {
            return null;
        }
        TreeNode node = new TreeNode(root.val + offset);
        node.left = cloneWithOffset(root.left, offset);
        node.right = cloneWithOffset(root.right, offset);
        return node;
    }
}