class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                nums[k]=nums1[i];
                i++;
            }
            else{
                nums[k]=nums2[j];
                j++;
            }
            k++;
        }
        if(i>=m){
            while(j<n){
                nums[k]=nums2[j];
                k++;
                j++;
            }
        }
        if(j>=n){
            while(i<m){
                nums[k]=nums1[i];
                k++;
                i++;
            }
        }
        for(int z=0;z<m+n;z++){
            nums1[z]=nums[z];
        }
    }
}