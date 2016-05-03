class Solution {
public:
    vector<vector<int>> combinationSum3(int k, int n) {
        DFS_backtracking(0,0,k,n);
        return res;
    }
     int DFS_backtracking(int sum, int level,int k,int target){
        if(sum>target) return 1;
        if(sum==target && solu.size()==k){
            res.push_back(solu);
            return 1;
        }
        if(sum==target) return 1;
        if(solu.size()==k)           // limited depth!!!!!!! can be considered as pruning.
            return 0;
        for(int i =level+1;i<10;i++){
            sum = sum +i;
            solu.push_back(i);
            int t=DFS_backtracking(sum,i,k,target);
            sum =sum - i;
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
