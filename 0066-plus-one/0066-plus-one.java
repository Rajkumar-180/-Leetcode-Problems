class Solution {
    public int[] plusOne(int[] digits) {
        int a = digits.length;
        int b[] = new int[a];
        for(int i=a-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
               digits[i]++;
               return digits;
            }
            digits[i]=0;
        }
        int c[]= new int[a+1];
        c[0] = 1;
        return c;
    }
}