class Solution {
    public int maxSubArray(int[] nums) {
        // optimal kadane's algorithm
        int max=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum<0){
                sum=0;
            }
            sum=Math.max(nums[i],sum+nums[i]);
            max=Math.max(max,sum);
        }
        return max;
        // // Brute and better
        // int sum=0;
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         max=Math.max(sum,max);
        //     }
        // }
        // return max;
    }
}