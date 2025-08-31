class Solution {
    // Optimized code
    public void solve(int[] candidates, int target, int index, List<Integer> curr, List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(candidates[i]>target) break;
            curr.add(candidates[i]);
            solve(candidates, target-candidates[i], i, curr, res);
            curr.remove(curr.size()-1);
        }
    }

    // // First code
    // public static void solve(int[] candidates, int target, int index, List<Integer> curr, List<List<Integer>> alist){
    //     if(target==0){
    //         alist.add(new ArrayList<>(curr));
    //         // System.out.println(alist);
    //         return;
    //     }
    //     if(target<0 || index>=candidates.length){
    //         return;
    //     }
    //     curr.add(candidates[index]);
    //     // System.out.println(curr);
    //     solve(candidates, target-candidates[index], index, curr, alist);
    //     curr.remove(curr.size()-1);
    //     solve(candidates, target, index+1, curr, alist);
    // }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // Optimized code
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        solve(candidates,target,0, new ArrayList<>(), res);
        return res;


        // // First code
        // List<List<Integer>> alist=new ArrayList<>();
        // List<Integer> curr=new ArrayList<>();
        // Arrays.sort(candidates);
        // solve(candidates, target, 0, curr, alist);
        // System.out.println(alist);
        // return alist;
    }
}