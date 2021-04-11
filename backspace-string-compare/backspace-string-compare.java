class Solution {
    public boolean backspaceCompare(String s, String t) {
        // use stack to put characters from one of the strings
        // pop the character if #
        String resultS = performStack(s);
        String resultT = performStack(t);
        
        return resultS.equals(resultT);
    }
    
    private String performStack(String input) {
        Stack<Character> stack = new Stack<Character>();
        
        for (char c : input.toCharArray()) {
            if(c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        
        return stack.toString();
    }
}