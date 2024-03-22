class Solution {
    public int numTilePossibilities(String tiles) {
        boolean[] visited = new boolean[tiles.length()];
        // approach1: hashSet
//         Set<String> result = new HashSet<>();
        
//         dfs_1(tiles, result, visited, new StringBuilder());
        
//         return result.size() - 1;
        
        // approach2: counter
        char[] tilesArray = tiles.toCharArray();
        Arrays.sort(tilesArray);
        return dfs_2(tilesArray, visited);
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
    
    private int dfs_2(char[] tilesArray, boolean[] visited) {
        int counter = 0;
        
        for (int i = 0; i < tilesArray.length; i++) {
            if (i > 0 && tilesArray[i] == tilesArray[i - 1] && !visited[i - 1]) continue;
            if (!visited[i]) {
                visited[i] = true;
                counter++;
                counter += dfs_2(tilesArray, visited);
                visited[i] = false;
            }
        }
        
        return counter;
    }
}