class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int width=1;
        int max=0;

        while(i<=j){
            width=j-i;
            if(height[i]<height[j]){
                max=Math.max(max,width*height[i]);
                i++;
            }
            else if(height[j]<height[i]){
                max=Math.max(max,width*height[j]);
                j--;
            }
            else{
                max=Math.max(max,width*height[i]);
                i++;
                j--;
            }
        }
        return max;
    }
}