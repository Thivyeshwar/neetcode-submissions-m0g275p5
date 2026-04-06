class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<numbers.length;i++){
            map.put(numbers[i],i+1);
        }

        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){

                int sum = numbers[i] + numbers[j];
                if(sum == target){
                    int a = map.get(numbers[i]);
                    int b = map.get(numbers[j]);
                    return new int[]{a,b};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
