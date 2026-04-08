class Solution {
    public int[][] kClosest(int[][] points, int k) {

        // sort points based on distance from origin
        Arrays.sort(points, (a, b) -> {
            double d1 = Math.sqrt(Math.pow(a[0], 2) + Math.pow(a[1], 2));
            double d2 = Math.sqrt(Math.pow(b[0], 2) + Math.pow(b[1], 2));
            return Double.compare(d1, d2);
        });

        int[][] ans = new int[k][2];  // ✅ fixed

        for (int i = 0; i < k; i++) {
            ans[i][0] = points[i][0];
            ans[i][1] = points[i][1];
        }

        return ans;
    }
}