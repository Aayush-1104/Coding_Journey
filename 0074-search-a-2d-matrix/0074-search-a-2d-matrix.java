class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Binary Search Approach 
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0;
        int high=n*m-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row=mid/m;
            int col=mid%m;
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;

        // // Traversal: Top right Approach 
        // int i=0;
        // int j=matrix[0].length-1;
        // while(i<matrix.length && j>=0){
        //     if(matrix[i][j]==target){
        //         return true;
        //     }
        //     else if(matrix[i][j]>target){
        //         j--;
        //     }
        //     else{
        //         i++;
        //     }
        // }
        // return false;
    }
}