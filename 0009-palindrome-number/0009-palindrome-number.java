class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int num=0;
        while(x>0){
            int temp =x%10;
            x=x/10;
            num=(num*10)+temp;
        }
        return num==original;
    }
}