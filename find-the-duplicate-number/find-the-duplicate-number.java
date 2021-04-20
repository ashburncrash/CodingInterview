class Solution {
    public int findDuplicate(int[] nums) {
        // approach 1: use hashset
        HashSet<Integer> set = new HashSet<>();
        
        for (int i : nums) {
            if (set.contains(i)) {
                return i;
            } else {
                set.add(i);
            }
        }
        
        return 0;
        // approach 2: marking what pointer went through already
    }
}