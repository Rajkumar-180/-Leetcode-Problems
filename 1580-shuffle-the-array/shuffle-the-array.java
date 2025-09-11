class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] firstPart = Arrays.copyOfRange(nums, 0, n);
        int[] secondPart = Arrays.copyOfRange(nums, n, nums.length);
        int[] finalarr = new int[nums.length];
        int j = 0;
        int k = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            finalarr[i] = firstPart[j++];
            else
            finalarr[i] = secondPart[k++];        
        }
        return finalarr;
    }
}