class Solution {
public:
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        sort(candidates.begin(),candidates.end());
        DFS_backtracking(candidates,0,-1,target);
        return res;
    }
    int DFS_backtracking(vector<int>& candidates, int sum, int level, int target){
        if(sum>target) return 1;
        if(sum==target){
            res.push_back(solu);
            return 1;
        }
        for(int i =level+1;i<candidates.size();i++){
            if(i!=level+1 && candidates[i]==candidates[i-1]) //the only difference compared with P39.
                continue;   //it removes the duplicates in result.
            sum = sum +candidates[i];
            solu.push_back(candidates[i]);
            int t=DFS_backtracking(candidates,sum,i,target);
            sum =sum - candidates[i];
            solu.pop_back();
            if(t)    // prune !!!
                break;
        }
        return 0;
    }
private:
    vector<vector<int>> res;
    vector<int> solu;
};
