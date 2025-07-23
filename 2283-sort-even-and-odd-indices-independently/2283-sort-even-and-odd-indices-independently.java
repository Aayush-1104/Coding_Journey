class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n=nums.length;
        int even_count=0;
        int odd_count=0;
        if(n%2==0){
            even_count=n/2;
            odd_count=n/2;
        }
        else{
            even_count=n/2+1;
            odd_count=n/2;
        }
        int[] even=new int[even_count];
        int[] odd=new int[odd_count];
        int e=0;
        int o=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even[e]=nums[i];
                e++;
            }
            else{
                odd[o]=nums[i];
                o++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        int[] res=new int[n];
        e=0;
        o=odd_count-1;
        for(int i=0;i<n;i++){
            if(i%2==0){
                res[i]=even[e];
                e++;
            }
            else{
                res[i]=odd[o];
                o--;
            }
        }

        return res;
    }
}