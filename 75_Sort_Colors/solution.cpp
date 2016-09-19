class Solution {
public:
void sortColors(vector<int>& nums)
{
	int i, j, k;
    int t;
	i = -1; j = nums.size(); k = 0;
	for(;k<j;k++){
        while(nums[k]==2 &&k<j) {t=nums[--j];nums[j]=nums[k];nums[k]=t;}
        while(nums[k]==0 &&i<k) {t=nums[++i];nums[i]=nums[k];nums[k]=t;}
    }
}
};
