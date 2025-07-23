class MyHashMap {

    private static final int size=1009;
    private LinkedList<Pair>[] map;

    public MyHashMap() {
       map=new LinkedList[size];
       for(int i=0;i<size;i++){
        map[i]=new LinkedList<>();
       }
    }

    private int hash(int key){
        return key%size;
    }
    
    public void put(int key, int value) {
        int h=hash(key);
        for(Pair pair:map[h]){
            if(pair.key==key){
                pair.value=value;
                return;
            }
        }
        map[h].add(new Pair(key, value));
    }
    
    public int get(int key) {
        int h=hash(key);
        for(Pair pair:map[h]){
            if(pair.key==key) return pair.value;
        }
        return -1;
    }
    
    public void remove(int key) {
        int h=hash(key);
        Iterator<Pair> it =map[h].iterator();
        while(it.hasNext()){
            if(it.next().key==key){
                it.remove();
                return;
            }
        }
    }
    
    private static class Pair{
        int key, value;
        Pair(int k, int v){
            key=k;
            value=v;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */