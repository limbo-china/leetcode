class Solution {
public:
    bool canJump(vector<int>& nums) {
        int n=nums.size();
        if(n==0||n==1)
            return true;
        int max=nums[0];
        for(int i=1;i<n;i++){
            if(max==0)
                return false;
            max--;
            if(max<nums[i])
                max=nums[i];
            if(i+max>=n-1)
                return true;
        }
        return true;  //为了通过编译，可有可无，可以为return false.
    }
};
