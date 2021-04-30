class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // check if the pixel has new color
        if (image[sr][sc] == newColor) return image;
        // passing the current color so that only the cells with
        // current color value will be changed to new color value
        fill(image, sr, sc, image[sr][sc], newColor);
        
        return image;
    }
    
    public void fill(int[][] image, int sr, int sc, int currColor, int newColor) {
        // check bounds and check if the cell needs to be changed to the new color
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != currColor) {
            return;
        }
        
        // change the color
        image[sr][sc] = newColor;
        
        // check top, down, left and right to see if change needs to happen
        fill(image, sr + 1, sc, currColor, newColor);
        fill(image, sr - 1, sc, currColor, newColor);
        fill(image, sr, sc + 1, currColor, newColor);
        fill(image, sr, sc - 1, currColor, newColor);
    }
}