class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int n=arr.length;
        // System.out.println(map.size());
        
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
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