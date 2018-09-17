class Solution {
    private int sum =0;
    public int sumOfLeftLeaves(TreeNode root) {
        sum(root, false);
        return sum;
    }
    private void sum(TreeNode root, boolean isLeft) {
        if(root == null) return ;
        if(root.left ==null && root.right ==null && isLeft) sum += root.val;
        sum(root.left, true);
        sum(root.right, false);
    }
}