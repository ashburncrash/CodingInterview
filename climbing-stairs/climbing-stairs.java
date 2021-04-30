class Solution {
    public int climbStairs(int n) {
        // if there are 0 or 1 stairs, return 1
        if (n == 0 || n == 1) return 1;
        
        // otherwise, use dynamic programming
        int[] stairsDP = new int[n + 1];
        
        stairsDP[0] = 1; // 0 stair -> 1 way
        stairsDP[1] = 1; // 1 stair -> 1 way
        
        for (int i = 2; i < n + 1; i++) {
            stairsDP[i] = stairsDP[i - 1] + stairsDP[i - 2];
        }
        
        return stairsDP[n];
    }
}