class Solution {
    public boolean isUgly(int n) {
        if(n==0)return false;
        while(n%2==0)n/=2;
        while(n%3==0)n/=3;
        while(n%5==0)n/=5;
        return n==1;

        // ArrayList<Integer> arr = new ArrayList<>();
        // int i=2;
        // for(;i<n/2;i++)
        // {
        //      if(n%i==0)
        //      {
        //         arr.add(i);
        //      }
        // }
        // if((!arr.contains(2) || !arr.contains(3) || !arr.contains(5)) )
        // {
        //     return true;
        // }
        // return false;
    }
}