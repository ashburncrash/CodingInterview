class Solution {
    public boolean isValid(String s) {
        // approach 1
//         Stack<Character> openBrackets = new Stack<>();
        
//         for(char c: s.toCharArray()) {
//             if (c == '(' || c == '{' || c == '[') {
//                 openBrackets.push(c);
//             } else {
//                 if (openBrackets.isEmpty() || openBrackets.peek() == '(' && c != ')' || openBrackets.peek() == '[' && c != ']' || openBrackets.peek() == '{' && c != '}'){
//                     return false;
//                 } 
//                 openBrackets.pop();
//             }   
//         }
//         return openBrackets.isEmpty();
        
        // approach 2
        HashMap<Character, Character> map = new HashMap<>();
        Stack<Character> openBrackets = new Stack<>();
        // [] {} ()
        
        map.put('[', ']');
        map.put('(', ')');
        map.put('{', '}');
        
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                openBrackets.push(c);
            }
            else {
                if(openBrackets.isEmpty() || map.get(openBrackets.peek()) != c) {
                    return false;
                }
                openBrackets.pop();
            }
        }
        
        return openBrackets.isEmpty();
    }
}