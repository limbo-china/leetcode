vector<vector<int>> permute(vector<int>& nums) {
    if (0 == nums.size() || 1 == nums.size()) return {nums};
    vector<vector<int>> vec;
    vector<int> num;
    for (int i = 0; i < nums.size(); i++) {
        num = nums;
        num.erase(num.begin()+i);
        vector<vector<int>> v = permute(num);
        for (int j = 0; j < v.size(); j++) {
            v[j].insert(v[j].begin(), nums[i]);
            vec.push_back(v[j]);
        }
    }
    return vec;
}
