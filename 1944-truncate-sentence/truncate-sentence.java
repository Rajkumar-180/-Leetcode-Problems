class Solution {
    public String truncateSentence(String s, int k) {
        String a[] = new String[k];
        String b[] = s.split(" ");
        for(int i=0;i<k;i++)
        {
              a[i] = b[i];
        }
        String ans = String.join(" ", a);
        return ans;
    }
}