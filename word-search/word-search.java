class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited = new boolean[board.length][board[0].length];
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                // first char of word found 
                if (board[r][c] == word.charAt(0) && check(board, r, c, word, 0, visited)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean check(char[][] board, int r, int c, String word, int index, boolean[][] visited) {
        if (index == word.length()) return true; // found
        
        // boundary check and check if visited
        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || visited[r][c] == true) return false;
        
        if (word.charAt(index) != board[r][c]) return false;
       
        visited[r][c] = true;
        
        boolean found = check(board, r + 1, c, word, index + 1, visited) || 
            check(board, r - 1, c, word, index + 1, visited) ||
            check(board, r, c + 1, word, index + 1, visited) ||
            check(board, r, c - 1, word, index + 1, visited);
        
        visited[r][c] = false;
        
        return found;
    }
}