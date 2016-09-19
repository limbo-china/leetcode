class Solution {
public:
    vector<vector<int>> combine(int n, int k) {
        DFSbacktracking(1,n,k);
        return res;
    }
    void DFSbacktracking(int i,int n,int k){
        if(k==0)
            res.push_back(solu);
        for(;i<=n;i++)
        {
            solu.push_back(i);k--;
            DFSbacktracking(i+1,n,k);
            solu.pop_back();k++;
        }
    }
private:
    vector<vector<int>> res;
    vector<int> solu;
};
