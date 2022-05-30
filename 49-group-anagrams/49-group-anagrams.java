class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        // loop through the strings in the array
        // for each string, we use it as a key to the map
        // we'll save the str to list in the map
        for (String str : strs) {
            char[] chars = str.toCharArray();
            //Arrays.sort(chars);
            char[] counts = new char[26];
            for (char c : chars){
                counts[c - 'a']++;
            }
            
            String sortedStr = String.valueOf(counts);
            
            // this will handle checking the key in the map, etc.
            List<String> anagrams = map.getOrDefault(sortedStr, new ArrayList<String>());
            anagrams.add(str);
            map.put(sortedStr, anagrams);
            
        }
        result.addAll(map.values());
        
        return result;
    }
}