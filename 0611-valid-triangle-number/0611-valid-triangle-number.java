class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int res=0;
        for(int i=n-1;i>=2;i--){
            int j=0;
            int k=i-1;
            while(j<k){
                if(nums[j]+nums[k]>nums[i]){
                    res+=(k-j);
                    k--;  
                }
                else{
                    j++;
                }
            }
        }
        return res;
    }
}