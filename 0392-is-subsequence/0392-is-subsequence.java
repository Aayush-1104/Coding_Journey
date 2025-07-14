class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (j<n && s.charAt(j) == t.charAt(i)) {
                j++;
            }
            if (j == n) {
                return true;
            }
        }
        if(j==n){
            return true;
        }
        return false;
    }
}
