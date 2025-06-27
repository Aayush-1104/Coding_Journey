class Solution {
    void MergeSort(int[] arr, int low, int high){
        if(high>low){
            int mid=low+(high-low)/2;
            MergeSort(arr, low, mid);
            MergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
        return;
    }
    void merge(int[] arr, int low, int mid, int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[low+i];
        }
        for(int i=0;i<n2;i++){
            right[i]=arr[mid+i+1];
        }
        int i=0;
        int j=0;
        int k=low;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }
            else{
                arr[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
    
    public int[] sortArray(int[] nums) {
        // Merge Sort:
        int low=0;
        int high=nums.length-1;
        int n=nums.length;
        int mid;
        MergeSort(nums, low, high);
        return nums;
        // // Insertion Sort;
        // int n=nums.length;
        // for(int i=1;i<n;i++){
        //     int key=nums[i];
        //     int j=i-1;
        //     while(j>=0 && nums[j]>key){
        //         nums[j+1]=nums[j];
        //         j--;
        //     }
        //     nums[j+1]=key;
        // }
        // return nums;

        // // Selection Sort
        // int n=nums.length;
        // int min_idx=0;
        // for(int i=0;i<n;i++){
        //     min_idx=i;
        //     for(int j=i+1;j<n;j++){
        //         if(nums[j]<nums[min_idx]) min_idx=j;
        //     }
        //     int temp=nums[min_idx];
        //     nums[min_idx]=nums[i];
        //     nums[i]=temp;
        // }
        // return nums;

        // // Bubble sort
        // int n=nums.length;
        // boolean swapped;
        // for(int i=0;i<n-1;i++){
        //     swapped=false;
        //     for(int j=1;j<n-i;j++){
        //         if(nums[j-1]>nums[j]){
        //             int temp=nums[j-1];
        //             nums[j-1]=nums[j];
        //             nums[j]=temp;
        //             swapped=true;
        //         }
        //     }
        //     if(swapped==false){
        //         return nums;
        //     }
        // }
        // return nums;
    }
}