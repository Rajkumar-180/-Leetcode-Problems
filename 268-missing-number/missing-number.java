class Solution {
    public int missingNumber(int[] nums) {
        int a = nums.length;
        int count = 0;
        Arrays.sort(nums);
        for(int i=0;i<a;i++)
        {
            if(nums[i]==count)
            {
                count++;
            }
            else
            break;
        }
        return count;
    }
}