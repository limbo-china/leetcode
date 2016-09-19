class Solution {
public:
vector<vector<int> > subsets(vector<int>& nums)
{
	int total = nums.size();

	if (!total)
		return res;
    res.push_back(solu);
	DFSbacktracking(nums, 0);
    return res;
}
void DFSbacktracking(vector<int> &nums, int i)
{
	for (; i < nums.size(); i++) {
        solu.push_back(nums[i]);
        res.push_back(solu);
        DFSbacktracking(nums,i+1);
        solu.pop_back();
	}
}
private:
vector<vector<int> > res;
vector<int> solu;
};
