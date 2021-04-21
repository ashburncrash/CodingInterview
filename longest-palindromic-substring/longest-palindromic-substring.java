class Solution {
    public String longestPalindrome(String s) {
        // brute force: subsets of the string and check if subset is palindrome -> o(n^3)
        // another approach: loop through the chars in string
        // then, expand from left and right
        if (s == null || s.length() == 0) return "";
        
        int start = 0;
        int end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int length1 = isPalindrome(s, i, i);
            int length2 = isPalindrome(s, i, i + 1); // in case the s.length => odd
            int max = Math.max(length1, length2); // choose the one with longer length
            
            if (max > end - start) { // if the longer substring has been found
                start = i - ((max - 1) / 2);
                end = i + (max / 2);
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    public int isPalindrome(String s, int start, int end) {
        if (s.length() == 0 || start > end) return 0;
        
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        
        return end - start - 1;
    }
}