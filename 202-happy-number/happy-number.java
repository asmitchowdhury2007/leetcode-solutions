class Solution {
    int square(int a){
        int sum = 0;
        while(a>0){
            int remainder = a%10;
            sum = sum + remainder*remainder;
            a=a/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(fast!=1){
            slow = square(slow);
            fast = square(square(fast));
            if(slow==fast && slow!=1){
                return false;
            }
        }
        return true;
    }
}