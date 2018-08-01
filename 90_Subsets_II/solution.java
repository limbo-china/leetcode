class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) { 
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> solu = new ArrayList<Integer>();     
        res.add(solu);
	    DFSbacktracking(nums, 0, solu, res);
        return res;
    }
    void DFSbacktracking(int[] nums, int j, List<Integer> solu, List<List<Integer>> res)
    {
        int i = j;
	    for (; i < nums.length; i++) {       
            if(i > j && nums[i] == nums[i-1]) continue;            
            solu.add(nums[i]);
            res.add(new ArrayList<Integer>(solu));
            DFSbacktracking(nums, i+1, solu, res);
            solu.remove(solu.size()-1);
	    }
    }
}