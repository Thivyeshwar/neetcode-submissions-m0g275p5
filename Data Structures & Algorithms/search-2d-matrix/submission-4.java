class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean flag = false;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int num1= matrix[i][j];
                //int num2 = matrix[0][j];

                if(num1 == target){
                    flag = true;
                    break;
                }
            }
        }

        if(flag){
            return true;
        }
        else{
            return false;
        }
    }
}
