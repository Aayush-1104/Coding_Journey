class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int total=0;
        int max_sum=nums[0];
        int curr_max=0;
        int min_sum=nums[0];
        int curr_min=0;
        
        for(int num: nums){
            total+=num;
            curr_max=Math.max(curr_max+num , num);
            max_sum=Math.max(curr_max, max_sum);

            curr_min=Math.min(curr_min+num, num);
            min_sum=Math.min(curr_min, min_sum);
        }
        if(max_sum>0){
            return Math.max(max_sum,total-min_sum);
        }
        else{
            return max_sum;
        }
    }
}