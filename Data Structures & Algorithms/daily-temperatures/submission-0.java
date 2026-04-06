class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int len =0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<temperatures.length;i++){
            boolean isFound = false;
            for(int j=i+1;j<temperatures.length;j++){

                int curr = temperatures[i];

                if(curr < temperatures[j]){
                    len = j-i;
                    list.add(len);
                    isFound = true;
                    break;
                }
            }
             if(!isFound){
                list.add(0);
               }
        }
        int[] ans = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
