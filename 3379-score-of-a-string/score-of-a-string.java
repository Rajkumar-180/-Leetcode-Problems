class Solution {
    public int scoreOfString(String s) {
        int res = 0;
        for(int i=0;i<s.length()-1;i++)
        {
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            res  += Math.abs(((int)a)-((int)b));
        }
        return res;
    }
}