class Solution {
    public void moveZeroes(int[] nums) {
        // Video solution efficient o(n) approach
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[count];
                nums[count]=nums[i];
                nums[i]=temp;
                count++;
            }
        }
        // // My efficient o(n) approach
        // int index=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=0){
        //         nums[index]=nums[i];
        //         if(index!=i){
        //             nums[i]=0;
        //         }
        //         index++;
        //     }
        // }
    }
}
