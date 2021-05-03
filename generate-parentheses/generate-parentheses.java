class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        
        createParenthesis(n, 0, 0, new StringBuilder(), result);
        
        return result;
    }
    
    // backtracking
    private void createParenthesis(int n, int openParen, int closeParen, StringBuilder current, List<String> result) {
        if (current.length() == n * 2) {
            result.add(current.toString());
            return;
        }
        
        if (openParen < n) {
            current.append("("); // add open bracket
            createParenthesis(n, openParen + 1, closeParen, current, result);
            current.deleteCharAt(current.length() - 1); //remove
        }
        
        if (closeParen < openParen) { // to match the parenthesis numbers
            current.append(")"); // add close bracket
            createParenthesis(n, openParen, closeParen + 1, current, result);
            current.deleteCharAt(current.length() - 1); // remove
        }
    }
}