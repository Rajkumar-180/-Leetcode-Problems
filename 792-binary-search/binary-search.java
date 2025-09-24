class Solution {
    public int search(int[] nums, int target) {
        int count = -1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                count = i;
            }
        }
        if(count==-1)
        {
            return -1;
        }
        return count;
    }
}