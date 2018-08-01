class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        int start = 0, size = res.size();
        for(int i=0;i<nums.length;i++){
            start = (i>0 && nums[i]==nums[i-1]) ? size : 0;
            size = res.size();
            for(int j=start; j< size;j++){
                List<Integer> solu = new ArrayList<Integer>(res.get(j));
                solu.add(nums[i]);
                res.add(solu);
            }
        }
        return res;
    }

}