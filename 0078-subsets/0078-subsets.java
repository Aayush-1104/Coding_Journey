class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> wList=new ArrayList<List<Integer>>();
        int n=nums.length;
        int pSize=(1<<n); // that means 2 raise to power n
        for(int i=0;i<pSize;i++){
            List<Integer> list=new ArrayList();
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    list.add(nums[j]);
                    }
                }
            wList.add(list);
        }
        return wList;
    }
}