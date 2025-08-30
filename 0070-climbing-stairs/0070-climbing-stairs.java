class Solution {
    // static int way(int n){
    //     if(n<=1){
    //         return 1;
    //     }
    //     return way(n-1)+way(n-2);
    // }
    public int climbStairs(int n) {
        int first=1;
        int second=2;
        if(n==1){
            return 1;
        }
        for(int i=2;i<n;i++){
            int temp=second;
            second=second+first;
            first=temp;
        }
        return second;
    }
}