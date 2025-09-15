class Solution {
    public int numIdenticalPairs(int[] nums) {
        int a = nums.length;
        int goodpair = 0;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                if(nums[i]==nums[j] && i < j)
                {
                    goodpair++;
                }
            }
        }
        return goodpair;
    }
}