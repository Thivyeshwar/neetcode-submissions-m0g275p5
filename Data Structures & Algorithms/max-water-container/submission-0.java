class Solution {
    public int maxArea(int[] heights) {

        int max = Integer.MIN_VALUE;
        int min = 0;
        int area = 0;
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){

                min = Math.min(heights[i],heights[j]);
                area = (j-i) * min;
                max = Math.max(area,max);
                
            }
            
        }
        return max;
    }
}
