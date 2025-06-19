class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        // Inplace marking
        ArrayList<Integer> result = new ArrayList<>();
        for(int num: nums){
            int index=Math.abs(num)-1;
            if(nums[index]>=0){
                nums[index] = -nums[index];
            }
            else{
                result.add(Math.abs(num));
            }
        }
        return result;

        // // Better than Brute force approach (Brute is like take a for loop from i to n and next for from i+1 to n and check for all elements which will give TLE.)
        // List<Integer> list = new ArrayList<>();
        // List<Integer> repeatedElements= new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(!list.contains(nums[i])){
        //         list.add(nums[i]);
        //     }
        //     else{
        //         repeatedElements.add(nums[i]);
        //     }
        // }
        // return repeatedElements;

        // // Using HashMap
        // // this is the 2nd approach of DSA series
        // HashMap<Integer,Integer> map=new HashMap<>();
        // ArrayList<Integer> list=new ArrayList<>();
        // for(int num:nums){
        //     if(map.containsKey(num)){
        //         map.put(num,2);
        //     }
        //     else{
        //         map.put(num,1);
        //     }
        //     if(map.get(num)>1){
        //         list.add(num);
        //     }
        // }
        // return list;

        // // Using HashSet
        // HashSet<Integer> seen = new HashSet<>();
        // ArrayList<Integer> duplicates = new ArrayList<>();
        // // Traverse the array
        // for (int num : nums) {
        //     if (seen.contains(num)) {
        //         // If the number is already in the set, it's a duplicate
        //         duplicates.add(num);
        //     } else {
        //         // Otherwise, add it to the set
        //         seen.add(num);
        //     }
        // }
        // return duplicates;

        

    }
}