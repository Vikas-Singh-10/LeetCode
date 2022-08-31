class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        
        int[][] pacific = new int[m][n];
        int[][] atlantic  = new int[m][n];
        
        for(int i=0; i<m; ++i) {
            pacific[i][0] = 1;
            atlantic[i][n-1] = 1;
            dfs(pacific, heights, i, 0);
            dfs(atlantic, heights, i, n-1);
        }
        for(int j=0; j<n; ++j) {
            pacific[0][j] = 1;
            atlantic[m-1][j] = 1;
            dfs(pacific, heights, 0, j);
            dfs(atlantic, heights, m-1, j);
        }
        
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<m; ++i) {
            for(int j=0; j<n; ++j) {
                if(atlantic[i][j] == 1 && pacific[i][j] == 1) {
                    final int ii = i;
                    final int jj = j;
                    res.add(
                        new ArrayList<>() {{
                            add(ii);
                            add(jj);
                        }}
                    );
                }
            }
        }
        
        return res;
    }
    
    private void dfs(int[][] ocean, int[][] heights, int i, int j) {
        int m = heights.length;
        int n = heights[0].length;
        
        ocean[i][j] = 1;
        
        if(valid(i+1, j, m, n) && heights[i+1][j] >= heights[i][j] && ocean[i+1][j] != 1) dfs(ocean, heights, i+1, j);
        if(valid(i-1, j, m, n) && heights[i-1][j] >= heights[i][j] && ocean[i-1][j] != 1) dfs(ocean, heights, i-1, j);
        if(valid(i, j+1, m, n) && heights[i][j+1] >= heights[i][j] && ocean[i][j+1] != 1) dfs(ocean, heights, i, j+1);
        if(valid(i, j-1, m, n) && heights[i][j-1] >= heights[i][j] && ocean[i][j-1] != 1) dfs(ocean, heights, i, j-1);
    }
    
    private boolean valid(int i, int j, int m, int n) {
        return !(i < 0 || i >= m || j < 0 || j >= n);
    }
}