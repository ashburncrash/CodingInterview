class Solution {
    public int findDuplicate(int[] nums) {
        // approach 1: use hashset - o(n) for both
//         HashSet<Integer> set = new HashSet<>();
        
//         for (int i : nums) {
//             if (set.contains(i)) {
//                 return i;
//             } else {
//                 set.add(i);
//             }
//         }
        
//         return 0;
        // approach 2: marking what pointer went through already - o(1) for space
        for (int i = 0; i < nums.length; i++) {
            // we mark elem @ nums[nums[i] - 1] as 'seen'
            // -1
            // -1 -4
            // -1 -4 -2 -3
            int seen = Math.abs(nums[i]) - 1;
            if (nums[seen] < 0) {
                return Math.abs(nums[i]);
            } else {
                nums[seen] = -nums[seen];
            }
        }
        
        return 0;
    }
}