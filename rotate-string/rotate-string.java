class Solution {
    public boolean rotateString(String A, String B) {
//         if (A.length() != B.length()) return false;
//         if (A.length() == 0 && B.length() == 0 || A == null && B == null) return true;
        
//         // rotate right -> (i + k) % len
//         // rotate left -> (i + len - k) % len
//         int k = B.indexOf(A.charAt(0));
        
//         if (k < 0) return false;
        
//         for (int i = 0; i < A.length(); i++) {
//             int index = (i + k) % A.length();
//             if (A.charAt(i) != B.charAt(index)){
//                 return false;
//             }
//         }
        
//         return true;
        
        // clever solution from the discussion
        // A + A contains B if B is the shifted version
        return A.length() == B.length() && (A + A).contains(B);
    }
}