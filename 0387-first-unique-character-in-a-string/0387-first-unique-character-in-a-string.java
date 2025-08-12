class Solution {
    public int firstUniqChar(String s) {
        // One traversal
        int Index[]=new int[26];
        Arrays.fill(Index,-1);
        for(int i=0;i<s.length();i++){
            if(Index[s.charAt(i)-'a']==-1){
                Index[s.charAt(i)-'a']=i;
            }
            else{
                Index[s.charAt(i)-'a']=-2;
            }
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(Index[i]>=0){
                res=Math.min(res,Index[i]);
            }
        }
        return (res==Integer.MAX_VALUE)?-1:res;

        // // Two traversals
        // int count[]=new int[26];
        // for(int i=0;i<s.length();i++){
        //     count[s.charAt(i)-'a']++;
        // }
        // for(int i=0;i<s.length();i++){
        //     if(count[s.charAt(i)-'a']==1) return i;
        // }
        // return -1;
    }
}