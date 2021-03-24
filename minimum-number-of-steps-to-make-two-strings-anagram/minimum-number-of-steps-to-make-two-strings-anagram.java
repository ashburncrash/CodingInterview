class Solution {
    // leetcode -> cdeeelot
    // practice -> acceiprt
    public int minSteps(String s, String t) {
        // anagram => same number of characters with different orders
        // t is to be changed to become s
        
        // check if s and t are already anagram
        if (isAnagram(s, t)) return 0;
        
        // approach 1
        // char -> index and value at the index will be counter.
//         int counter = s.length();
//         int[] stringCounter = new int[26];
        
//         for (char c : t.toCharArray()){
//             stringCounter[c-'a']++;
//         }
        
//         // stringCounter[0] = 2 -> a
//         // stringCounter[1] = 1 -> b
//         // counter = 3
//         //subtracting what exists.
//         for (char c : s.toCharArray()){
//             if (stringCounter[c-'a'] > 0) {
//                 stringCounter[c-'a']--;
//                 counter--;
//             }
//         }
        
//         return counter;
        
        // approach 2
        // hashmap 
        Map<Character, Integer> stringCounter = new HashMap<>();
        
        for (char c: t.toCharArray()) {
            stringCounter.put(c, stringCounter.getOrDefault(c, 0) + 1);
        }
        
        int counter = 0;
        
        for (char c: s.toCharArray()) {
            stringCounter.put(c, stringCounter.getOrDefault(c, 0) - 1);
            if(stringCounter.get(c) < 0) {
                counter ++;
            }
        }
        
        
        return counter;
    }
    
    public boolean isAnagram(String s, String t){
        // following the constraint - s.length() == t.length()
        
        // sort both strings
        Arrays.sort(s.toCharArray());
        Arrays.sort(t.toCharArray());
        
        // compare them
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) != t.charAt(i)) return false;
        }
        return true;
    }
}