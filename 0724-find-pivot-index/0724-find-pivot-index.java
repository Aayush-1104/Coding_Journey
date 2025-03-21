class Solution {
    public int pivotIndex(int[] nums) {
        // Expected Approach
        int sum=0;
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            // sum will act as rightsum
            sum-=nums[i];
            if(sum==leftsum) return i;
            leftsum+=nums[i];
        }
        return -1;

        // // Naive solution
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     int leftsum=0;
        //     for(int j=0;j<i;j++){
        //         leftsum+=nums[j];
        //     }
        //     int rightsum=0;
        //     for(int j=i+1;j<n;j++){
        //         rightsum+=nums[j];
        //     }
        //     if(rightsum==leftsum){
        //         return i;
        //     }
        // }
        // return -1;
    }
}