class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums.length == 0 || nums == null) return result;
        
        // approach 1: use hashset - o(n)
//         Set<Integer> set = new HashSet<>();
        
//         for (int i : nums) {
//             if (set.contains(i)){
//                 result.add(i);
//             } else {
//                 set.add(i);
//             }
//         }
        
        // approach 2: use negative marking - o(n) and space: o(1)
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                result.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }
        
        
        return result;
    }
}