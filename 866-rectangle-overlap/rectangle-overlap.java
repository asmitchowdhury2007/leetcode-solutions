class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        boolean x_overlap = false;
        boolean y_overlap = false;
        int x_min = Math.min(rec1[0],rec2[0]);
        if(x_min == rec1[0]){
            if(rec2[0]<rec1[2]){
                x_overlap = true;
            }
        }
        else{
            if(rec1[0]<rec2[2]){
                x_overlap = true;
            }
        }
        int y_min = Math.min(rec1[1],rec2[1]);
        if(y_min == rec1[1]){
            if(rec2[1]<rec1[3]){
                y_overlap = true;
            }
        }
        else{
            if(rec1[1]<rec2[3]){
                y_overlap = true;
            }
        }
        if(x_overlap == true && y_overlap == true){
            return true;
        }
        else{
            return false;
        }
    }
}