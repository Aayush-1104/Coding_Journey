class Solution {
    public int maximumCount(int[] nums) {
        // int left=0;
        // int right=nums.length-1;
        // int neg=0;
        // int pos=0;
        // while(left<right){
        //     if(nums[left]<0){
        //         neg++;
        //         left++;
        //     }
        //     if(nums[left]==0){
        //         left++;
        //     }
        //     if(nums[right]>0){
        //         pos++;
        //         right--;
        //     }
        //     if(nums[right]==0){
        //         right--;
        //     }
        // }
        // return Math.max(neg,pos);
        // Iterative O(n) approach
        int positiveCount=0;
        int negativeCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                positiveCount++;
            }
            else if(nums[i]<0){
                negativeCount++;
            }
        }
        return Math.max(positiveCount,negativeCount);
    }
}