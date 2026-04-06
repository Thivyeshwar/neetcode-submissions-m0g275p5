class Solution {
    public int trap(int[] height) {
        
        int trappedWater = 0;

        for(int i=0;i<height.length;i++){

            int lMax = 0;
            int rMax = 0;

            for(int l = 0;l<i;l++){
                lMax = Math.max(lMax,height[l]);
            }

            for(int r = i; r<height.length;r++){
                rMax = Math.max(rMax,height[r]);
            }

            int currentQuantity = Math.min(lMax,rMax) - height[i];

            if(currentQuantity > 0){
                trappedWater += currentQuantity;
            }
        }
        return trappedWater;
    }
}
