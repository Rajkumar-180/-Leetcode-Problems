class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[] = text.split(" ");
        int a = arr.length;
        boolean b = false;
        int count = 0;
        for(int i=0;i<a;i++)
        {
            b= true;
            for(int j=0;j<arr[i].length();j++)
            {
               char c = arr[i].charAt(j);
               if (brokenLetters.contains(String.valueOf(c)))
               {
                b=false;
                break;
               }
            }
        if(b)
        {
             count++;
        }
     }
         return count;
    }
}