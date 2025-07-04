class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2){
        int n1=nums1.length;
        int n2=nums2.length;
        if (n1 > n2)
            return findMedianSortedArrays(nums2, nums1);

        int begin=0;
        int end=n1;

        while(begin<=end){ 
            int i1=(begin+end)/2;
            int i2=((n1+n2+1)/2)-i1;

            int min1=(i1==n1)?Integer.MAX_VALUE:nums1[i1];
            int max1=(i1==0)?Integer.MIN_VALUE:nums1[i1-1];
            int min2=(i2==n2)?Integer.MAX_VALUE:nums2[i2];
            int max2=(i2==0)?Integer.MIN_VALUE:nums2[i2-1];

            if(max2<=min1 && max1<=min2){
                if((n1+n2)%2==0){
                    return (double)(Math.max(max1,max2)+Math.min(min1,min2))/2.0;
                }
                else{
                    return (double)Math.max(max1,max2);
                }
            }
            else if(max1>min2){
                end=i1-1;
            }
            else{
                begin=i1+1;
            }
        }
        return 0;
    }
}