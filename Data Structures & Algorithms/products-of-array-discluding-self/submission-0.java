class Solution {
    public int[] productExceptSelf(int[] nums) {

        if(nums.length == 1){
            return new int[]{0};
        }
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(i,nums[i]);
        }

        int beforeP = 1;
        int afterP = 1;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){

            if(i > 0){
                int j = 0;
                beforeP = 1;
                while(j < i){
                    beforeP = beforeP * map.get(j);
                    j++;
                }
            }

            int k = i+1;
            afterP = 1;
            while(k < nums.length){
                afterP = afterP * map.get(k);
                k++;
            }
            int finalP = beforeP * afterP;
            list.add(finalP);
        }

        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}  
