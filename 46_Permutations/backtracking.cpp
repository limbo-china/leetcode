class Solution {
public:
    vector<vector<int>> permute(vector<int>& nums) {
        int n=nums.size();
        while(n){
            flag.push_back(0);
            n--;
        }
        if(nums.size()==0)
            return res;
        dfs(0,nums);
        return res;
    }
    void dfs(int d,vector<int>& nums){
        if(d==nums.size())
            res.push_back(solu);
        for(int i=0;i<nums.size();i++){
            if(flag[i])
                continue;
            solu.push_back(nums[i]);
            flag[i]=1;
            dfs(d+1,nums);
            solu.pop_back();
            flag[i]=0;
        }
    }
private:
    vector<vector<int>> res;
    vector<int> solu;
    vector<int> flag;
};
