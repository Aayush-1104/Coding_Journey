class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=-1;
        int j=nums.length;
        while(true){
            do{i++;}while(i<nums.length && nums[i]%2==0);
            do{j--;}while(j>=0 && nums[j]%2!=0);
            if(i>j){
                break;
            }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        return nums;
    }
}