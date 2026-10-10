class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0 || matrix[0].length==0){
            return false;
        }
        int low = 0;
        int high = matrix.length-1;
        int select_row = -1;
        while(high>=low){
            int mid = (low+high)/2;
            if(matrix[mid][0]<target){
                select_row = mid;
                low = mid+1;
            }
            else if(matrix[mid][0]==target){
                return true;
            }
            else{
                high = mid-1;
            }
        }
        if(select_row==-1){
            return false;
        }
        else{
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
                    high = mid-1;
                }
            }
        }
        return false;
    }
}