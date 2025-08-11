class Solution {
    public boolean isAnagram(String s, String t) {
        // Using HashTable
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> map=new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char ch: t.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)-1);
        }
        for(var pair : map.entrySet()){
            if(pair.getValue()!=0) return false;
        }
        return true;


        // // Done with strings using character array of 26
        // char[] arr=new char[26];
        // if(s.length()!=t.length()) return false;
        // for(int i=0;i<s.length();i++){
        //     arr[s.charAt(i)-'a']++;
        //     arr[t.charAt(i)-'a']--;
        // }
        // for(int i=0;i<26;i++){
        //     if(arr[i]!=0) return false;
        // }
        // return true;
    }
}