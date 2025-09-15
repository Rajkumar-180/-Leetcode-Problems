class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[] = text.split(" "); //Convert the one string to string array
        int a = arr.length; //length of the array
        boolean b = false; 
        int count = 0; //Declare Non Matched words count = 0
        for(int i=0;i<a;i++)
        {
            b= true;
            for(int j=0;j<arr[i].length();j++) //give the index of i.length to condition
            {
               char c = arr[i].charAt(j); 
               if (brokenLetters.contains(String.valueOf(c))) //check the character as been contained or not
               {
                b=false;
                break;
               }
            }
        if(b)//if true
        {
             count++;
        }
     }
         return count;
    }
}