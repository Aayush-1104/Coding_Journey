class Solution {
    public int addDigits(int num){
        // another logic
        if(num==0) return 0;
        else if(num%9==0) return 9;
        else return num%9;
    //    // My recursive code
    //    if(num<=9){
    //     return num;
    //    }
    //    return addDigits(num%10+num/10);
    }
}