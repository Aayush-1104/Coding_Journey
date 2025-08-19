class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // simplest version
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        List<Integer> sorted=new ArrayList<>(freq.keySet());
        sorted.sort((a,b)-> freq.get(b)-freq.get(a));
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=sorted.get(i);
        }
        return res;
        // // Better
        // // Using Priority Queue
        // Map<Integer,Integer> freq=new HashMap<>();
        // for(int num: nums){
        //     freq.put(num,freq.getOrDefault(num,0)+1);
        // }
        // PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)-> a.getValue()-b.getValue());
        // for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
        //     pq.offer(entry);
        //     if(pq.size()>k){
        //         pq.poll();
        //     }
        // }
        // int[] res=new int[k];
        // int i=0;
        // while(!pq.isEmpty()){
        //     res[i++]=pq.poll().getKey();
        // }
        // return res;

        // // Using hashmap and bucket sort
        // Map<Integer,Integer> freq=new HashMap<>();
        // for(int num: nums){
        //     freq.put(num,freq.getOrDefault(num,0)+1);
        // }
        // List<Integer>[] buckets=new List[nums.length+1];
        // for(int key: freq.keySet()){
        //     int f=freq.get(key);
        //     if(buckets[f]==null) buckets[f]=new ArrayList<>();
        //     buckets[f].add(key);
        // }
        // List<Integer> res=new ArrayList<>();
        // for(int i=buckets.length-1;i>=0 && res.size()<k;i--){
        //     if(buckets[i]!=null){
        //         res.addAll(buckets[i]);
        //     }
        // }
        // return res.stream().mapToInt(i->i).toArray();
        
    }
}