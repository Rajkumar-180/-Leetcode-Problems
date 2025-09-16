class Solution {
    public void reverseString(char[] s) {
        char [] a = new char[s.length];

        // fill reversed into a[]
        for(int i = 0; i < s.length; i++) {
            a[i] = s[s.length - 1 - i]; 
        }

        // copy a[] back into s[]
        for(int i = 0; i < s.length; i++) {
            s[i] = a[i];
        }

        // print the reversed array (optional, for stdout)
        for(int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }
}
