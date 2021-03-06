class Solution {
    public boolean isPalindrome(String s) {
        // puntuations
        // spaces
        // lowercase/uppercase
        if (s == null) return false;
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        
        String ans = sb.toString();
        ans = ans.toLowerCase();
        
        int front = 0;
        int back = ans.length() - 1;
        
        while (front < back) {
            if (ans.charAt(front) != ans.charAt(back)) return false;
            front++;
            back--;
        }
        
        return true;
    }
}