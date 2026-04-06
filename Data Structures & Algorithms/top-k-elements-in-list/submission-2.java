class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int[] temp = new int[map.size()];
        int index = 0;
        for(int value : map.values()){
            temp[index++] = value;
        }

        int count =0;
        Arrays.sort(temp);
       int[] ans = new int[k];
        for(int i=temp.length-1;i>=0;i--){
            if(count <k){
            int curr = temp[i];
                for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                    if(entry.getValue() == curr){
                    ans[count++] = entry.getKey();

                    map.put(entry.getKey(),-1);
                    }
                    if(count == k){
                        break;
                    }           
                }  
             }
           }
        return ans;
    }
}
