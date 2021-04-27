class Solution {
    public void rotate(int[][] matrix) {
        // use linear algebra
        // transpose and then reflect
        int size = matrix.length;
        
        // transpose on diagonal
        for (int r = 0; r < size; r++) {
            for (int c = r; c < size; c++) {
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }
        
        // reflect - cols
        for (int r = 0; r < size; r++) {
            for(int c = 0; c < size / 2; c++){
                int temp = matrix[r][c];
                matrix[r][c] = matrix[r][size - c - 1];
                matrix[r][size - c - 1] = temp;
            }
        }
    }
}