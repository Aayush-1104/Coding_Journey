class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int count=0;
        if(nums[0]%2==0 && nums[0]<=threshold){
            count=1;
        }
        int max=Math.max(0,count);
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]%2==0 && count==0 && nums[i]<=threshold){
                count++;
                max=Math.max(count,max);
            }
            else if(count>0 && nums[i-1]%2!=nums[i]%2 && nums[i]<=threshold){
                count++;
                max=Math.max(max,count);
            }
            else{
                count=0;
                if(nums[i]%2==0 && nums[i]<=threshold){
                    count=1;
                    max=Math.max(max, count);
                }
            }
        }
        return max;
    }
}