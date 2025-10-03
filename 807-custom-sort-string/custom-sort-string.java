class Solution {
    public String customSortString(String order, String s) {
        int ar[]= new int[26];
        for(char a:s.toCharArray()){
            ar[a-'a']++;
        }
        StringBuilder sb= new StringBuilder();
         for(char a:order.toCharArray()){
            while(ar[a-'a']-->0){

                sb.append(a);
            }
        }
         for(int i=0;i<26;i++){
            while(ar[i]-->0){
                sb.append((char)(i+'a'));
            }
        }
        return sb.toString();
    }
}