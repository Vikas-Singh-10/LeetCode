class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int j = 0, k = 0, p = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0;i<mat.length;i++){
            k = i; p = 0;
            while(k<mat.length && p<mat[0].length){
                temp.add(mat[k++][p++]);
                
            }
            Collections.sort(temp);
             k = i; p = 0;
            j = 0;
            while(k<mat.length && p<mat[0].length){
                mat[k++][p++] = temp.get(j++);
                
            }
            temp = new ArrayList<>();
        }
        for(int i = 1;i<mat[0].length;i++){
            p = i; k = 0;
            while(p<mat[0].length && k<mat.length){
                temp.add(mat[k++][p++]);
                
            }
            Collections.sort(temp);
             p = i; k = 0;
            j = 0;
            while(p<mat[0].length && k<mat.length){
                mat[k++][p++] = temp.get(j++);
                
            }
            temp = new ArrayList<>();
        }
        return mat;
    }
}