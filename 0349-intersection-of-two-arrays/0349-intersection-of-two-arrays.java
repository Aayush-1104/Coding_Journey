import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //  // Brute force approach
    //     List<Integer> intersectionList=new ArrayList<>();
    //     for(int num1:nums1){
    //         for(int num2:nums2){
    //             if(num1==num2 && !intersectionList.contains(num1)){
    //                 intersectionList.add(num1);
    //             }
    //         }
    //     }
    // // Convert List<Integer> to int[]
    //     int[] result = new int[intersectionList.size()];
    //     for (int i = 0; i < intersectionList.size(); i++) {
    //         result[i] = intersectionList.get(i);
    //     }
        
    //     return result;
// Hashing approach
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();

        // Add all elements of nums1 to the set
        for (int num : nums1) {
            set.add(num);
        }

        // Check elements of nums2 in the set and add to intersectionSet
        for (int num : nums2) {
            if (set.contains(num)) {
                intersectionSet.add(num);
            }
        }

        // Convert the intersection set to an array
        int[] result = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            result[index++] = num;
        }
        return result;
    }
}
