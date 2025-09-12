class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for(String raj:words)
        {
            boolean consistent = true;
            for(char rk:raj.toCharArray())
            {
                if(allowed.indexOf(rk)==-1)
                {
                consistent=false;
                break;
                }
            }
        if(consistent)
        count++;
        }
     
        return count;
    }
}