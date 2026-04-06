class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> l1 = new ArrayList<>();
        
        for(int i=0;i<=nums.length-3;i++){
            for(int j=i+1;j<=nums.length-2;j++){
                for(int k=j+1;k<=nums.length-1;k++){
                  List<Integer> list = new ArrayList<>();
                    int sum = nums[i] + nums[j] + nums[k];

                    if(sum == 0){
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);

                        if(!l1.contains(list)){
                            l1.add(list);
                        }
                    }
                }
            } 
        }
        return l1;
    }
}
