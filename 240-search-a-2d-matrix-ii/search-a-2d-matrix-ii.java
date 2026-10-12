class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        if(row==0){
            return false;
        }
        int col = matrix[0].length;
        int row_choice = row-1;
        int col_choice = 0;
        while(row_choice>=0 && col_choice<col){
            if(matrix[row_choice][col_choice]==target){
                return true;
            }
            else if(matrix[row_choice][col_choice]>target){
                row_choice--;
            }
            else{
                col_choice++;
            }
        }
        return false;
    }
}