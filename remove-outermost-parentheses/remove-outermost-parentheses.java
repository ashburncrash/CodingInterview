class Solution {
    public String removeOuterParentheses(String S) {
        Stack<Character> stack = new Stack<>();
        
        int startIndex = 0;
        StringBuilder sb = new StringBuilder();
        
        // I could have char array from s.toCharArray, which would be faster, but it would be memory expensive then using String.charAt
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                if (stack.isEmpty()) {
                    startIndex = i;
                }
                stack.push(S.charAt(i));
            } else if (S.charAt(i) == ')') {
                stack.pop();
                if (stack.isEmpty()) {
                    sb.append(S.substring(startIndex + 1, i));
                }
            }
        }
        
        return sb.toString();
    }
}