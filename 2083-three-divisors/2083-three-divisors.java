class Solution {
    public boolean isThree(int n) {
        int count=2;
        int N=(int)Math.sqrt(n);
        if(N*N!=n){
            return false;
        }
        for(int i=2;i<=N;i++){
            if(N%i==0){
                count++;
            }
        }
        if(count==3){
            return true;
        }
        else{
            return false;
        }
    }
}