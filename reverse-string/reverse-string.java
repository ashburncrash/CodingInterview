class Solution {
    public void reverseString(char[] s) {
        // there are many ways to do this..
        // using StringBuilder -> reverse or loop s and build backwards
        // StringBuilder sb = new StringBuilder(new String(s));
        // sb.reverse().toString();
        // since output requires char array
        int left = 0;
        int right = s.length - 1;
        
        while(left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
       
    }
}