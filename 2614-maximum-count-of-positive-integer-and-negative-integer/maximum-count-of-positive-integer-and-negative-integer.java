class Solution {
    public int maximumCount(int[] nums) {
        int count = 0,res =0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            count++;
            if(nums[i]<0)
            res++;
        }
        if(count>=res)
        {
            return count;
        }
        return res;
    }
}