class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0;
        int leftsum=0;
        for(int num:nums){
            sum+=num;
        }
        for(int i=0;i<nums.length;i++){
            sum-=nums[i];
            if(sum==leftsum) return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}