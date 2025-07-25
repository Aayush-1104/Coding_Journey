class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        // code here
        int top=0;
        int left=0;
        int right=mat[0].length-1;
        int bottom=mat.length-1;
        ArrayList<Integer> list=new ArrayList<>();
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                list.add(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(mat[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    list.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(mat[i][left]);
                }
            left++;
            }
        }
        return list;
    }
}