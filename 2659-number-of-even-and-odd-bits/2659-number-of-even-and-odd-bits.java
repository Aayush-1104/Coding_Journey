class Solution {
    public int[] evenOddBit(int n) {
        int odd=(n & 0xAAAAAAAA);
        int even= (n & 0x55555555);
        int oddCount=0;
        int evenCount=0;
        while(even>0){
            even=(even & even-1);
            evenCount++;
        }
        while(odd>0){
            odd=(odd & odd-1);
            oddCount++;
        }
        int arr[]={evenCount,oddCount};
        return arr;
    }
}