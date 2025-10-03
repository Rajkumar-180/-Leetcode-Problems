class Solution {
    public String addSpaces(String s, int[] sp) {
        StringBuilder sb = new StringBuilder();
        int i=0;
        for(int p=0;p<s.length();p++){
            if(i<sp.length&&sp[i]==p){
                sb.append(" ");
                i++;
            }
            sb.append(s.charAt(p));
        }
        return sb.toString();
    }
}