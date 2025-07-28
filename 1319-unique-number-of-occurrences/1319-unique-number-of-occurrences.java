class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int n=arr.length;
        // System.out.println(map.size());
        
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        HashSet<Integer> freqSet = new HashSet<>();
        for (int freq : map.values()) {
            if (!freqSet.add(freq)) {
                return false; // duplicate frequency found
            }
        }

        return true;
    }
}