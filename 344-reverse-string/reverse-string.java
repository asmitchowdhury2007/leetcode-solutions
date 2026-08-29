class Solution {
    public void reverseString(char[] s) {
        int low = 0;
        int length = s.length;
        int high = length-1;
        for(int i=0;i<length/2;i++){
            char temp = s[i];
            s[i] = s[length-i-1];
            s[length-i-1] = temp;
        }
        
        
    }
}