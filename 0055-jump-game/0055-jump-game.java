class Solution {
    public boolean canJump(int[] nums) {
        // Simplest Approach 
        int farthest=0;
        int n=nums.length;
        if(n==1){
            return true;
        }
        for(int i=0;i<n;i++){
            if(i>farthest) return false;
            farthest=Math.max(farthest,i+nums[i]);
            if(farthest>=n-1){
                return true;
            }
        }
        return false;

        // // My code
        // int maxReach=0;
        // // int i;
        // int n=nums.length;
        // if(n==1){
        //     return true;
        // }
        // int lastIndex=0;
        // for(int i=0;i<n;i++){
        //     maxReach=Math.max(maxReach,nums[i]+i);
        //     if(i==lastIndex){
        //         if(maxReach==i){
        //             return false;
        //         }
        //         lastIndex=maxReach;
        //         if(maxReach>=n-1){
        //             return true;
        //         }
        //     }
        // }
        // return true;
    }
}