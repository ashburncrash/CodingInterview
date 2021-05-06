class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    max = Math.max(max, check(grid, r, c));
                }
            }
        }
        
        return max;
    }
    
    // can also keep boolean[][] visited array that sets the visited rows and cols (true)
    private int check(int[][] grid, int r, int c) {
        // boundary check
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) {
            return 0;
        }
        
        // check if the cell is land or water
        if (grid[r][c] == 0) {
            return 0;
        }
        
        int counter = 1;
        grid[r][c] = 0; // mark as visited - or keep boolean[][] visited
        
        counter += check(grid, r - 1, c);
        counter += check(grid, r + 1, c);
        counter += check(grid, r, c - 1);
        counter += check(grid, r, c + 1);
        
        return counter;
    }
}