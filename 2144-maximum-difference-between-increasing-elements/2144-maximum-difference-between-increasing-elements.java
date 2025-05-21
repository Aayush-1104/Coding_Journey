class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int minVal=nums[0];
        int max=Math.max(-1,nums[1]-nums[0]);
        for(int j=1;j<n;j++){
            max=Math.max(max,nums[j]-minVal);
            minVal=Math.min(minVal,nums[j]);
        }
        if(max==0){
            max=-1;
        }
        return max;
    }
}