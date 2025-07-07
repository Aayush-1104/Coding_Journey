class Solution {
    public static void swap(int i,int j,int a[]){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(low++,mid++,nums);
            }
            else if(nums[mid]==2){
                swap(high--,mid,nums);
            }
            else{
                mid++;
            }
        }
        // // Brute force 
        // int count_0=0;
        // int count_1=0;
        // int count_2=0;
        // for(int i=0;i<n;i++){
        //     if(nums[i]==0){
        //         count_0++;
        //     }
        //     else if(nums[i]==1){
        //         count_1++;
        //     }
        //     else{
        //         count_2++;
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     if(count_0>0){
        //         nums[i]=0;
        //         count_0--;
        //     }
        //     else if(count_1>0){
        //         nums[i]=1;
        //         count_1--;
        //     }
        //     else{
        //         nums[i]=2;
        //         count_2--;
        //     }
        // }
        // // System.out.println(Arrays.toString(nums));
    }
}