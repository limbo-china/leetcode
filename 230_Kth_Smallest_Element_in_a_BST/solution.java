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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
		helper(root, k, result);
		return result.get(k-1);
    }
    private static void helper(TreeNode root, int k, List<Integer> result) {
		if(root != null && result.size()<k){
			helper(root.left, k, result);
			if(result.size()<k){
				result.add(root.val);
				helper(root.right, k, result);
			}
		}
	}
}