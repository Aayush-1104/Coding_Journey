class Solution:
    def firstUniqChar(self, s: str) -> int:
        from collections import Counter
        
        freq = Counter(s)  
        
        for i, ch in enumerate(s):  
            if freq[ch] == 1:
                return i
        return -1

        # dic={}
        # for i in s:
        #     if(i in dic.keys()):
        #         dic[i]=dic.get(i)+1
        #     else:
        #         dic[i]=1
        # c=0
        # for i, j in dic.items():
        #     c=c+1
        #     if(j==1):
        #         return c-1
        # return -1