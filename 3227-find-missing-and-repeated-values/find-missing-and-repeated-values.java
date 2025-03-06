class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length * grid.length;
        int[] counts = new int[n + 1], res = new int[2];
        
        for (int[] row : grid) for (int v : row) counts[v]++;
        for (int i = 1; i <= n; i++) if (counts[i] == 2) res[0] = i; else if (counts[i] == 0) res[1] = i;
        return res;
        
    }
}