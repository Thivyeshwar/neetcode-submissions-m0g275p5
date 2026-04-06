class TimeStampedValues{
    public String value;
    public int timestamp;

    public TimeStampedValues(String value, int timestamp){
        this.value = value;
        this.timestamp = timestamp;
    } 
}

class TimeMap {
    HashMap<String, ArrayList<TimeStampedValues>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key,new ArrayList<>());
        }
        ArrayList<TimeStampedValues> tt = map.get(key);
        tt.add(new TimeStampedValues(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)){
            return "";
        }

        ArrayList<TimeStampedValues> searchValues = map.get(key);
        Optional<TimeStampedValues> targetValues = binarySearch(searchValues,timestamp);
        if(targetValues.isEmpty()){
            return "";
        }
        return targetValues.get().value;
    }

    public Optional<TimeStampedValues> binarySearch(ArrayList<TimeStampedValues> searchValues,
    int timestamp){
        int start = 0;
        int end = searchValues.size()-1;
        int matchIndx = -1;


        while(start <= end){
            int mid = start + (end-start)/2;

            TimeStampedValues curr = searchValues.get(mid);
            if(curr.timestamp <= timestamp){
                matchIndx = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }

        if(matchIndx == -1){
            return Optional.empty();
        }
        return Optional.of(searchValues.get(matchIndx));
    }
}
