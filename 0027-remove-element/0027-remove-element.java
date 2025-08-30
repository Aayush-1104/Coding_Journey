class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int left=0;
        int right=nums.length-1;
        // if(n==1){
        //     if(nums[0]==val){
        //         return 0;
        //     }
        //     else{
        //         return 1;
        //     }
        // }
        while(left<=right){
            while(left<=right && nums[left]!=val){
                left++;
            }
            while(left<=right && nums[right]==val){
                right--;
            }
            if(left<=right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            }
        }
        return left;
    }

}