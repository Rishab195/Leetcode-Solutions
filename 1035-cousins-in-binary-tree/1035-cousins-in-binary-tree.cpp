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
    bool isCousins(TreeNode* root, int x, int y) {
        vector<vector<int>> res;
        if(root==nullptr){
            return false;
        }
        TreeNode * Xparent = nullptr;
        TreeNode * Yparent = nullptr;
        int Xlevel = -1;
        int Ylevel = -1;

        queue<pair<TreeNode*, TreeNode*>> q; // {node,parent}
        q.push({root,nullptr});
        int level = 0;

        while(!q.empty()){
            int size = q.size();
            for(int i=0;i<size;i++){      

                auto[curr, parent] = q.front();
                q.pop();
                if(curr->val==x){
                    Xparent = parent;
                    Xlevel = level;
                }
                if(curr->val==y){
                    Yparent = parent;
                    Ylevel = level;
                }

                if(curr->left!=nullptr) q.push({curr->left,curr});
                if(curr->right!=nullptr) q.push({curr->right,curr});
                
                
            }
            level++;
        }

        if(Xparent==Yparent){
            return false;
        }
        if(Xlevel!=Ylevel){
            return false;
        }
        return true;
    }
};