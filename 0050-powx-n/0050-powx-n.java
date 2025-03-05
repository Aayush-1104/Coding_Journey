class Solution {
    public double powerX(double x,long n){
        if(x==0) return 0;
        if(n==0) return 1;
        if(n%2==0) return powerX(x*x,n/2); //if n is even
        else return x*powerX(x*x,(n-1)/2); //if n is odd
    }
    public double myPow(double x, int n) {
        // // Mathematics method3
        // if(n==0){
        //     return 1.0;
        // }
        // long exp=n;
        // if(n<0){
        //     x=1/x;
        //     exp=-exp;
        // }
        // double temp=myPow(x,(int)(exp/2));
        // temp*=temp;
        // if(exp%2==0){
        //     return temp;
        // }
        // else{
        //     return temp*x;
        // }

        // Using Recursion
        double pow=0;
        long absN=n;
        if(n<0){
            pow=1.0/powerX(x,-absN);
        }
        else{
            pow=powerX(x,absN);
        }
        return pow;
    }   
}