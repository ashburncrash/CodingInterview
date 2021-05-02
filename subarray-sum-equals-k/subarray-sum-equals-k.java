class Solution {
    public int subarraySum(int[] nums, int k) {
        // brute force - o(n^2)
//         int currSum;
//         int counter = 0;
        
//         for (int i = 0 ; i < nums.length; i++) {
//             currSum = 0;
//             for(int j = i; j < nums.length; j++) {
//                 currSum += nums[j];
//                 if (currSum == k) {
//                     counter++;
//                 }
//             }
//         }
        
//         return counter;
        
        // o(n)
        Map<Integer, Integer> map = new HashMap<>();
        // map holds sum as key, occurence as value
        map.put(0, 1);
        
        int counter = 0;
        int currSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (map.containsKey(currSum - k)) {
                counter += map.get(currSum - k);
            }
            
            if (!map.containsKey(currSum)){
                map.put(currSum, 1);
            } else {
                map.put(currSum, map.get(currSum) + 1);
            }
        }
        
        return counter;
    }
}