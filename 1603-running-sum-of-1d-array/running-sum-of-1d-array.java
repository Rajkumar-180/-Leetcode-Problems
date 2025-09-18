class Solution {
    public int[] runningSum(int[] nums) {
        int a[] = new int[nums.length];
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(i==0)
            {
                a[i]=nums[i];
                count += nums[i];
            }
            else
            {
                a[i] = nums[i]+count;
                count += nums[i];
            }
        }
        return a;
    }
}