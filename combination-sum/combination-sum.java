class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        // backtrack
        findCombinationSum(candidates, target, new ArrayList<Integer>(), result, 0);
        return result;
    }
    
    private void findCombinationSum(int[] candidates, int target, List<Integer> list, List<List<Integer>> result, int index) {
        if (target == 0) {
            result.add(new ArrayList(list));
            return;
        }
        
        if (target < 0) {
            return;
        }
        
        // dfs
        for(int i = index; i < candidates.length; i++) {
            list.add(candidates[i]);
            findCombinationSum(candidates, target - candidates[i], list, result, i);
            list.remove(list.size() - 1);
        }
    }
}