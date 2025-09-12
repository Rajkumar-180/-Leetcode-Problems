class Solution {
    public int[] getConcatenation(int[] nums) {
        int a = nums.length;
        int count = a;
        int b[] = new int[a*2];
        for(int i=0;i<a;i++)
        {
                b[i]=nums[i];
                b[count++]=nums[i];
        }
        return b;
    }
}