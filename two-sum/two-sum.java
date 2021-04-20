class Solution {
    public int[] twoSum(int[] nums, int target) {
        // approach 1: find the difference and loop through the array
        // approach 2: use hashmap with val & index
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)){
                return new int[] {i, map.get(difference)};
            } else {
                map.put(nums[i], i);
            }
        }   
        
        return null;
    }
}