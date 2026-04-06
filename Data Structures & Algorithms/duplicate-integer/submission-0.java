class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int num: nums){
            mp.put(num,mp.getOrDefault(num,0)+1);

            if(mp.get(num) >= 2){
                return true;
            }
        }
        return false;
        // for(int i=0;i<nums.length;i++){
        //     mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        // }
        
    }
}