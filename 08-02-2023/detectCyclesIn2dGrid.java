class Solution {
    int m, n;
    boolean[][] vs;
    int[][] dir = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public boolean containsCycle(char[][] g) {
        m = g.length; n = g[0].length;
        vs = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!vs[i][j] && bfs(g, i, j, -1, -1))
                 return true;
            }
        }
        return false;
    }
    
    private boolean bfs(char[][] g, int i, int j, int x, int y) {  
        char c = g[i][j];
        Queue<int[]> q = new LinkedList<>();
        vs[i][j] = true;
        q.offer(new int[]{i, j, x, y});
        while (!q.isEmpty()) {
            for (int k = 0, l = q.size(); k < l; k++) {
                int curr[] = q.poll();
                for (int[] d : dir) {
                    int row = curr[0] + d[0], col = curr[1] + d[1];
                    if (row < 0 || row >= m || col < 0 || col >= n || g[row][col] != c) continue;
                    if (row == curr[2] && col == curr[3]) continue;  
                    if (vs[row][col]) return true;
                    q.offer(new int[]{row, col, curr[0], curr[1]});
                    vs[row][col] = true;
                }
            }
        }
        return false;
    }
}
