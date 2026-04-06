class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int flag = nums[i];

                if(nums[j] == flag){
                    return true;
                }
            }
        }
        return false;
    }
}