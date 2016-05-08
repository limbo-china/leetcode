class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n=nums.size()-1;
        return myMaxSub(nums,0,n);
    }
    int myMaxSub(vector<int>&nums,int left,int right){
        if(left>right)
            return INT_MIN;
        int middle=(left+right)/2;
        int lmax=nums[middle],rmax=nums[middle],lsum=nums[middle],rsum=nums[middle];
        for(int i=middle-1;i>=left;i--){
            lsum+=nums[i];
            if(lsum>lmax)
                lmax=lsum;
        }
        for(int i=middle+1;i<=right;i++){
            rsum+=nums[i];
            if(rsum>rmax)
                rmax=rsum;
        }
        return max(myMaxSub(nums,left,middle-1),max(lmax+rmax-nums[middle],myMaxSub(nums,middle+1,right)));
    }
};
