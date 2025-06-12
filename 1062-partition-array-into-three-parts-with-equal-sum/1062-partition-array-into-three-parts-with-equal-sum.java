class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        int n=arr.length;
        int parts=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        if(sum%3!=0){
            return false;
        }
        int i=0;
        int currSum=0;
        while(i<n){
            currSum+=arr[i];
            if(currSum==sum/3){
                currSum=0;
                parts++;
            }
            i++;
        }
        return parts>=3;
    }
}