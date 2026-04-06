class LRUCache {

    LinkedHashMap<Integer,Integer> cache;
    int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new LinkedHashMap<>(capacity,0.5f,true);
    }
    
    public int get(int key) {

        if(!cache.containsKey(key)){
            return -1;
        }
        return cache.get(key);
    }
    
    public void put(int key, int value) {
        cache.put(key,value);

        if(cache.size() > capacity){
             Map.Entry<Integer,Integer> entry = cache.firstEntry();
             int firstKey = entry.getKey();
             cache.remove(firstKey);
        }
    }
}
