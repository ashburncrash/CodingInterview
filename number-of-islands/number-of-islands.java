class Solution {
    public int numIslands(char[][] grid) {
        // loop through the grid
            // find the  number of islands
        int nIslands = 0;
        for (int r = 0; r < grid.length; r++){
            for (int c = 0; c < grid[0].length; c++){
                // check if grid has island indicator
                if (grid[r][c] == '1') {
                    nIslands += dfs(grid, r, c);
                }
            }
        }
        
        return nIslands;
    }
    
    public int dfs(char[][] grid, int r, int c) {
        // check the boundaries
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != '1') {
            return 0;
        }
        
        // mark the cell as visited
        grid[r][c] = '0';
        
        // check top down left and right sides
        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
        
        return 1;
    }
}