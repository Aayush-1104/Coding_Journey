import java.util.*;
class Solution {
    public int mySqrt(int x) {
        int low=1;
        int high=x/2;
        if(x==1 || x==0){
            return x;
        }
        int mid;
        int index=0;
        while(low<=high){
            mid=(low+high)/2;
            long msq=1L*mid*mid;
            if(msq==x){
                return mid;
            }
            else if(msq>x){
                high=mid-1;
            }
            else{
                low=mid+1;
                index=mid;
            }
        }
        // int s = (int) Math.sqrt (x);
        // return s;
        return index; 
    }
}