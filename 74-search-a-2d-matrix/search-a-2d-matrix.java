class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0 || matrix[0].length==0){
            return false;
        }
        int cols = matrix[0].length;
        int low = 0;
        int high = matrix.length*matrix[0].length-1;
        while(high>=low){
            int mid = (low+high)/2;
            if(matrix[mid/cols][mid%cols]==target){
                return true;
            }
            else if(matrix[mid/cols][mid%cols]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
}