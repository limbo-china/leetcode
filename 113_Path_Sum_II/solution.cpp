/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> pathSum(TreeNode* root, int sum) {
        if(root){
            solu.push_back(root->val);
            search(root,sum);
        }
        return res;
    }
    void search(TreeNode *root, int sum){
        if(!root->left&&!root->right)
            if(root->val == sum)
                    res.push_back(solu);
        if(root->left){
            solu.push_back(root->left->val);
            search(root->left,sum-root->val);
            solu.pop_back();
        }
        if(root->right){
            solu.push_back(root->right->val);
            search(root->right,sum-root->val);
            solu.pop_back();
        }
    }
private:
    vector<vector<int>> res;
    vector<int> solu;
};
