class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1.0;
        }
        long exp=n;
        if(n<0){
            x=1/x;
            exp=-exp;
        }
        double temp=myPow(x,(int)(exp/2));
        temp*=temp;
        if(exp%2==0){
            return temp;
        }
        else{
            return temp*x;
        }
    }   
}