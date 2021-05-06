class Solution {
    public int islandPerimeter(int[][] grid) {
       
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    return checkPerimeter(grid, r, c);
                }
            }
        }
        
        return 0;
        
        /* iterative approach - counting the edges
        
        int perimeter = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    // check up, down, left, right
                    if (grid[r - 1][c] == 0 || r == 0) perimieter++;
                    if (grid[r + 1][c] == 0 || r == grid.length) perimeter++;
                    if (grid[r][c - 1] == 0 || c == 0) perimeter++;
                    if (grid[r][c + 1] == 0 || c == grid[0].length) perimeter++;
                }
            }
        }
        
        return perimeter;
        */
    }
    
    private int checkPerimeter(int[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) {
            return 1;
        }
        
        if (grid[r][c] == -1) return 0;
        
        grid[r][c] = -1;
        
        int perimeter = 0;
        
        perimeter += checkPerimeter(grid, r + 1, c);
        perimeter += checkPerimeter(grid, r - 1, c);
        perimeter += checkPerimeter(grid, r, c + 1);
        perimeter += checkPerimeter(grid, r, c - 1);
        
        return perimeter;
    }
}