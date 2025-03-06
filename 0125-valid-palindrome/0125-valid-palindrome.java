class Solution {
    public boolean palindrome(String s, int start, int end){
        if(start>=end){
            return true;
        }
        return ((s.charAt(start)==s.charAt(end)) && palindrome(s,start+1,end-1));
    }
    public boolean isPalindrome(String s) {
        String t=s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int start=0;
        int end=t.length(); 
        return palindrome(t,start,end-1);
    }
}