class Solution {
    public int numTrees(int n) {
        int[] nums = new int[n+1];
        nums[0] = 1;
        nums[1] = 1;
        for(int j = 2;j <=n; j++){
            int num = 0;
            for(int i=0; i<(j+1)/2; i++){
                if(i == j - 1 - i)
                    num += nums[i]*nums[i];
                else
                    num += 2*nums[i]*nums[j-1-i];
            }
            nums[j] = num;
        }
        return nums[n];
    }
}