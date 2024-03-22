class Solution {
    public int numTilePossibilities(String tiles) {
        // approach1: hashSet
        Set<String> result = new HashSet<>();
        boolean[] visited = new boolean[tiles.length()];
        
        dfs_1(tiles, result, visited, new StringBuilder());
        
        return result.size() - 1;
        // approach2: counter
    }
    
    private void dfs_1(String tiles, Set<String> result, boolean[] visited, StringBuilder sb) {
        result.add(sb.toString());
        
        for (int i = 0; i < tiles.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                sb.append(tiles.charAt(i));
                dfs_1(tiles, result, visited, sb);
                sb.deleteCharAt(sb.length() - 1);
                visited[i] = false;
            }
        }
    }
    
    private int dfs_2() {
        return 0;
    }
}