class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = matrix[0][0];
        int high = matrix[rows-1][cols-1];
        int result = -1;
        while(low<=high){
            int mid = (low+high)/2;
            int count = 0;
            boolean is_found = false;
            int row_choice = rows-1;
            int col_choice = 0;
            while(row_choice>=0 && col_choice<cols){
                if(matrix[row_choice][col_choice]<=mid){
                    count=count+row_choice+1;
                    if(matrix[row_choice][col_choice]==mid){
                        is_found = true;
                    }
                    col_choice++;
                }
                else{
                    row_choice--;
                }
            }
            if(count<k){
                low = mid+1;
            }
            else{
                result = mid;
                high = mid-1;
            }
        }
        return result;

    }
}