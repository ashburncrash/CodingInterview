class Solution {
    public int coinChange(int[] coins, int amount) {
        // validation check
        if (amount == 0 || coins == null || coins.length == 0) return 0;
        
        //use dynamic programming - bottom up approach
        int[] changeDP = new int[amount + 1];
        
        // since we're looking for min way of giving changes, 
        // will prefill the array with max value
        Arrays.fill(changeDP, amount + 1);
        
        // 0 amount -> 0 way of giving changes
        changeDP[0] = 0;
        
        for (int c = 0; c < coins.length; c++){
            for (int i = 0; i < amount + 1; i++){
                if (i >= coins[c]) { // is the remaining amount enough to take the coin at c?
                    changeDP[i] = Math.min(changeDP[i], 1 + changeDP[i - coins[c]]);
                } 
            }
        }
        
        return changeDP[amount] != amount + 1 ? changeDP[amount] : -1;
    }
}