/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool hasPathSum(struct TreeNode* root, int sum) {
    if(!root)
    return false;
    sum-=root->val;
    if(!root->left&&!root->right)
    return (sum==0);
    else if(root->left&&root->right)
    return hasPathSum(root->left,sum)||hasPathSum(root->right,sum);
    else if(!root->left)
    return hasPathSum(root->right,sum);
    else
    return hasPathSum(root->left,sum);
}
