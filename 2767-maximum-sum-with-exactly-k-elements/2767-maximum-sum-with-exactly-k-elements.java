class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        int maxElement=nums[0];
        int index=0;
        for(int i=1;i<n;i++){
            if(maxElement<nums[i]){
                maxElement=nums[i];
                index=i;
            }
        }
        for(int i=0;i<k;i++){
            sum+=nums[index];
            nums[index]+=1;
        }
        return sum;
    }
}