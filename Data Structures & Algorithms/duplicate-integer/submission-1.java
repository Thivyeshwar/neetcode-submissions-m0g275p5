class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        boolean isDuplicate = false;
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            
            if(set.contains(num)){
                isDuplicate = true;
            }
            else{
                set.add(num);
            }
        }
        if(isDuplicate){
            return true;
        }
        else{
            return false;
        }
    }
}