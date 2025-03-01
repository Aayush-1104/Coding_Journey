class Solution {
    public boolean isPowerOfTwo(int n) {
        // Brian kerningham's method
        if(n==-2147483648){
            return false;
        }
        return n!=0 && ((n & (n-1))==0);


        // if(n==0){
        //     return false;
        // }
        // while(n%2==0){
        //     n/=2;
        // }
        // return n==1;
    }
}