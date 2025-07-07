class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int temp[]=new int[nums.length];
        int index=0;
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                temp[index++]=nums[i];
            }
            else if(nums[i]==pivot){
                count++;
            }
        }
        for(int i=0;i<count;i++){
            temp[index++]=pivot;
        }
        for(int i=0;i<n;i++){
            if(nums[i]>pivot){
                temp[index++]=nums[i];   
            }
        }
        for(int i=0;i<n;i++){
            nums[i]=temp[i];
        }
        return nums;
    }
}