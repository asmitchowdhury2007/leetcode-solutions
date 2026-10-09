class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int low = 0;
        int high = matrix.length-1;
        int total_cols = matrix[0].length-1;
        int select_row = -1;
        while(high>=low){
            int mid = (low+high)/2;
            if(matrix[mid][total_cols]==target){
                return true;
            }
            else if(matrix[mid][total_cols]<target){
                low = mid+1;
            }
            else{
                select_row = mid;
                high=mid-1;
            }
        }
        if(select_row==-1){
            return false;
        }
        low = 0;
        high = matrix[0].length-1;
        while(high>=low){
            int mid = (low+high)/2;
            if(matrix[select_row][mid]==target){
                return true;
            }
            else if(matrix[select_row][mid]<target){
                low = mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}