class Solution {
    public int trap(int[] height) {
        
        int i=0;
        int j = height.length-1;

        int lMax = 0;
        int rMax = 0;
        int trappedWater = 0;

        while(i < j){

            if(height[i] < height[j]){
                lMax = Math.max(lMax,height[i]);

                if(height[i] >= lMax){
                    lMax = height[i];
                }
                else{
                    trappedWater += lMax - height[i];
                }
                i++;
            }
            else{
                if(height[j] >= rMax){
                    rMax = height[j];
                }
                else{
                    trappedWater += rMax - height[j];
                }
                j--;
            }
        }
        return trappedWater;
    }
}
