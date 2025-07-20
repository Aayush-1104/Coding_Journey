class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        // Optimal Approach 
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r-1;i++){
            for(int j=0;j<c-1;j++){
                if(matrix[i][j]!=matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
        // // My Approach 
        // for(int d=0;d<matrix[0].length;d++){
        //     int temp=matrix[0][d];
        //     int i=0;
        //     int j=d;
        //     while(i<matrix.length && j<matrix[0].length){
        //     if(matrix[i][j]!=temp){
        //         return false;
        //      }
        //     i++;
        //     j++;
        // }
        // }
        // for (int r = 1; r < matrix.length; r++) {
        //     int val = matrix[r][0];
        //     int i = r, j = 0;
        //     while (i < matrix.length && j < matrix[0].length) {
        //         if (matrix[i][j] != val) return false;
        //         i++;
        //         j++;
        //     }
        // }
        
        // return true;
    }
}