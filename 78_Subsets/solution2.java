class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        for(int i=0;i<nums.length;i++){
            List<List<Integer>> tmp = new ArrayList<List<Integer>>();
            for(int j=0; j<res.size();j++){
                List<Integer> solu = new ArrayList<Integer>(res.get(j));
                solu.add(nums[i]);
                tmp.add(solu);
            }
            res.addAll(tmp);
        }
        return res;
    }

}