class Solution {
    public int[] singleNumber(int[] nums) {
        int[] arr = new int[2];
        int x=0;
        for(int i=0;i<nums.length;i++){
            x=x^nums[i];
        }
        int k=(x & (~(x-1)));
        int r1=0;
        int r2=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&k)!=0){
                r1=r1^nums[i];
            }
            else{
                r2=r2^nums[i];
            }
        }
        arr[0]=r1;
        arr[1]=r2;
        return arr;
    }
}