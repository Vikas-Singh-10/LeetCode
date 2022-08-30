class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        int start = 0;
        int end = matrix.length-1;
        int row = 0;
        while(row <= matrix.length-1){
            while(start < end){
                int temp = matrix[row][start];
                matrix[row][start] = matrix[row][end];
                matrix[row][end] = temp;
                start++;
                end--;
            }
            start = 0;
            end = matrix.length-1;
            row++;
        }
    }
}