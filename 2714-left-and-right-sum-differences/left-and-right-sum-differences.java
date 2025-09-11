class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] nums1 = new int[nums.length];
        int[] nums2 = new int[nums.length];  
        nums1 [0] =0;
        nums2 [nums.length-1] = 0; 
        for(int i=1;i<nums.length;i++)
        {
           nums1[i] = nums1[i-1] + nums[i-1];
        
        } 
        for(int i=nums.length-2;i>=0;i--)
        {
            nums2[i] = nums[i+1]+nums2[i+1];
        }
        int[] nums3 = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            nums3[i] = Math.abs(nums1[i]-nums2[i]);
        }
        return nums3;
    }
}