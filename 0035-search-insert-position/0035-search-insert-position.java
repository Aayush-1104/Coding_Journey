class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        int mid=0;
        int index=0;
        if(target<nums[0]){
            return 0;
        }
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target){
                index=mid;
                return index;
            }
            else if(nums[mid]<target){
                index=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return index+1;
    }
}