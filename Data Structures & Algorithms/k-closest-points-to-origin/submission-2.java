class Solution {
    public int[][] kClosest(int[][] points, int k) {

        Arrays.sort(points, (a,b) ->{
        double d1 = Math.sqrt(
                Math.pow(0 - a[0], 2) + Math.pow(0 - a[1], 2)
            );

            double d2 = Math.sqrt(
                Math.pow(0 - b[0], 2) + Math.pow(0 - b[1], 2)
            );
            return Double.compare(d1,d2);
    });
         int[][] ans = new int[k][2];

        for(int i=0;i<k;i++){
            ans[i][0] = points[i][0];
            ans[i][1] = points[i][1];
        }
return ans;
    }
}
