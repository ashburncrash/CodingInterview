class Solution {
    public List<List<Integer>> combine(int n, int k) { // up to nth, size of k
        List<List<Integer>> result = new ArrayList<>();
        
        // backtrack
        generateCombination(n, k, 1, result, new ArrayList<Integer>());
        
        return result;
    }
    
    private void generateCombination(int n, int k, int index, List<List<Integer>> result, ArrayList<Integer> list){
        if (list.size() == k) {
            result.add(new ArrayList(list));
            return;
        }
        // list.size() == k
        for(int i = index; i <= n; i++){
            list.add(i);
            generateCombination(n, k, i + 1, result, list);
            list.remove(list.size() - 1);
        }
    }
}