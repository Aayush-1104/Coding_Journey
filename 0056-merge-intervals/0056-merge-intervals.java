class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> merged =new ArrayList<>();
        merged.add(intervals[0]); 

        for(int i=1;i<intervals.length;i++){
            int[] last=merged.get(merged.size()-1);

            if(last[1]>=intervals[i][0]){ 
                last[1]=Math.max(last[1],intervals[i][1]); 
            }
            else{
                merged.add(intervals[i]);
            }
         }   
        return merged.toArray(new int[merged.size()][]);
    }
}