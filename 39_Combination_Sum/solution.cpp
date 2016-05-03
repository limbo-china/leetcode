class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        sort(candidates.begin(),candidates.end()); //the solution must be in non-descending order, so need to sort the candidates first.
        DFS_backtracking(candidates,0,target,0);
        return res;
    }
    int DFS_backtracking(vector<int>& candidates, int sum ,int target, int level){
        if(sum>target) return 1;
        if(sum==target){
            res.push_back(solu); //find a combination
            return 1;
        }
        for(int i=level;i<candidates.size();i++){
            sum=sum+candidates[i];
            solu.push_back(candidates[i]);
            int t=DFS_backtracking(candidates,sum,target,i);  //recursive
            sum=sum-candidates[i];    //backtracking,return to the former state
            solu.pop_back();
            if(t)    //prune!!!!! improve the efficiency
                break;
        }
        return 0;
    }
private:
    vector<vector<int>> res;
    vector<int> solu;
};
