class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            int low=0;
            int high=n-1;
            while(low<high){
                int temp=matrix[low][i];
                matrix[low][i]=matrix[high][i];
                matrix[high][i]=temp;
                low++;
                high--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}