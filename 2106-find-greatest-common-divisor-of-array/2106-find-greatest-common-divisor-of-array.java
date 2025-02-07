class Solution {
    public int findGCD(int[] nums) {
        int mn=Integer.MAX_VALUE;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<mn){
                mn=nums[i];
            }
            if(mx<nums[i]){
                mx=nums[i];
            }
        }
        int gcd=1;
        for(int i=1;i<=mn;i++){
            if(mn%i==0 && mx%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}