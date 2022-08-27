class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
         int[][] sums = findSumMatrix(matrix);
        int masSumNoLargerThanK = Integer.MIN_VALUE;
        int m = matrix.length, n = matrix[0].length;
        for(int hr=0 ; hr<m; ++hr){
            for(int vr = 0; vr <n; ++vr){
                for(int row = hr+1; row<=m; ++row){
                    for(int col=vr+1; col<=n; ++col){
                        int result = sums[row][col] - sums[row][vr] - sums[hr][col] + sums[hr][vr];
                        if(result == k) return result;
                        else if(result < k){
                            masSumNoLargerThanK = Math.max(result, masSumNoLargerThanK);
                        }
                            
                    }
                }
            }
        }
        return masSumNoLargerThanK;
    }
    public int[][] findSumMatrix(int[][] mat){
        int[][] sums = new int[mat.length+1][mat[0].length+1];
        sums[0][0] = mat[0][0];
        for(int row=1; row<sums.length; ++row){
            for(int col=1; col<sums[row].length; ++col){
                sums[row][col] = sums[row-1][col] + sums[row][col-1] - sums[row-1][col-1] + mat[row-1][col-1];
            }
        }
        
        return sums;
    }
}