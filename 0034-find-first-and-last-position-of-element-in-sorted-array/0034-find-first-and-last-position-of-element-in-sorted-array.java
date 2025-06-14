class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int mid;
        int res[]={-1,-1};
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]<target){
                l=mid+1;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                if(mid==0 || nums[mid]!=nums[mid-1]){
                    res[0]=mid;
                    break;
                }
                else{
                    r=mid-1;
                }
            }
        }
        l=0;
        r=nums.length-1;
        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid]<target){
                l=mid+1;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                if(mid==nums.length-1 || nums[mid]!=nums[mid+1]){
                    res[1]=mid;
                    break;
                }
                else{
                    l=mid+1;
                }
            }
        }
        return res;
    }
}