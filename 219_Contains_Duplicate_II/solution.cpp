class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        unordered_set<int> s;
        if(k == 0) return false;
        if(k>=nums.size()) k=nums.size()-1;
        for(int i=0;i<=k;i++)
            if(s.find(nums[i])!=s.end())
               return true;
            else
               s.insert(nums[i]);
        for(int n=k+1;n<nums.size();n++){
            s.erase(nums[n-k-1]);
            if(s.find(nums[n])!=s.end())
                return true;
            s.insert(nums[n]);
        }
        return false;
    }
};