class Solution {
    public int trap(int[] height) {
        // code here
        int n=height.length;
        int left=0;
        int right=n-1;
        int res=0;
        int lmax=0;
        int rmax=0;
        while(left<right){
            if(height[left]<height[right]){
                if(lmax<=height[left]){
                    lmax=height[left];
                }
                else{
                    res+=lmax-height[left];
                }
                left++;
            }
            else{
                if(height[right]>=rmax){
                    rmax=height[right];
                }
                else{
                    res+=rmax-height[right];
                }
                right--;
            }
        }
        return res;
    }
}