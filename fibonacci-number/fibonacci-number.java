class Solution {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        // approach 1: top-down with memoization
        int[] memo = new int[n + 1];
        return fibMemo(n, memo);
        
        // approach 2: bottom-up with dp
//         int[] fibDP = new int[n + 1];
//         fibDP[0] = 0;
//         fibDP[1] = 1;
        
//         for (int i = 2; i < n + 1; i++){
//             fibDP[i] = fibDP[i - 1] + fibDP[i - 2];
//         }
        
//         return fibDP[n];
    }
    
    public int fibMemo(int n, int[] memo) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        if (memo[n] == 0){
            memo[n] = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);
        }
        
        return memo[n];
    }
}