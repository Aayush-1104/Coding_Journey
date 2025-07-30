class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num: arr1){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int index=0;
        for(int i=0;i<arr2.length;i++){
            int val=arr2[i];
            while(map.getOrDefault(val,0)>0){
                arr1[index++]=val;
                map.put(val,map.get(val)-1);
            }
            map.remove(val);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            int val=e.getKey();
            int count=e.getValue();
            while(count-->0){
                list.add(val);
            }
        }
        Collections.sort(list);
        for(int val: list){
            arr1[index++]=val;
        }
        return arr1;
    }
}