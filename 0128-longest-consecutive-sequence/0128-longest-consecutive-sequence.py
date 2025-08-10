class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        st=set()
        res=0
        for num in nums:
            st.add(num)
        for val in st:
            if val-1 not in st:
                curr=1
                while curr+val in st:
                    curr+=1
                res=max(res,curr)
        return res