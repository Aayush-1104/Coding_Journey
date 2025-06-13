class Solution {
    public int[] plusOne(int[] arr) {
        int carry=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==9)
            {
                carry=1;
                arr[i]=0;
            }
            else
            {
                arr[i]++;
                return arr;
            }

        }
        int[] arr1 = new int[arr.length+1];
        if(carry==1)
        {
            arr1[0]=1;
            for(int i=1;i<arr1.length;i++)
            {
                arr1[i] = 0;
            }
        }
        if(carry==1)
        {
            return arr1;
        }
        return arr;
        // int num=0;
        // int n=digits.length;
        // for(int i=0;i<n;i++){
        //     num*=10;
        //     num+=digits[i];
        // }
        // num++; //124
        // int reverse=0;
        // int digit=0;
        // int count=0;
        // while(num>0){
        //     count++;
        //     digit=num%10;
        //     num/=10;
        //     reverse*=10;
        //     reverse+=digit;
        // }
        // System.out.println(reverse);
        // int arr1[]=new int[count];
        // int i=0;
        // while(reverse>0){
        //     arr1[i]=reverse%10;
        //     reverse/=10;
        //     i++;
        // }
        // return arr1;
    }
}