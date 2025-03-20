/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<vector<int>> levelOrderBottom(TreeNode* root) {
        vector<vector<int>> res;
        if(root==nullptr){
            return res;
        }
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()){
            vector<int> vec;
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode * curr = q.front();
                q.pop();
                if(curr->left!=nullptr) q.push(curr->left);
                if(curr->right!=nullptr) q.push(curr->right);
                vec.push_back(curr->val);
            }
            res.insert(res.begin(),vec);
        }
        return res;
    }
};