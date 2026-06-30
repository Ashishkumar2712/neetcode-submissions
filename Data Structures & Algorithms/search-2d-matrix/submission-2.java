class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int cols = matrix[0].length;
        int i=0;
        int j = row*cols-1;

        while (i<=j){
            int mid = (i+j)/2;
            int matrixmid = matrix[mid/cols][mid%cols];

            if (matrixmid == target) {
                return true ;

            }
            else if (matrixmid < target){
                i = mid+1;
            }
            else {
                j = mid-1;
            }
        }
        return false ;
    }
}
