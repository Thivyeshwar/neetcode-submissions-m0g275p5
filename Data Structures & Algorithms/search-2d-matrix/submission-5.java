class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean flag = false;
        int rows=matrix.length;
        int cols=matrix[0].length;

        int start = 0;
        int end = rows * cols -1;

        while(start <= end){

            int mid = start + (end-start)/2;

            int row = mid / cols;
            int col = mid % cols;

            int num = matrix[row][col];

            if(num == target){
                return true;
            }
            else if(num > target){
                end = mid-1;
            }
            else if(num < target){
                start = mid+1;
            }
        }
        return false;
    }
}
