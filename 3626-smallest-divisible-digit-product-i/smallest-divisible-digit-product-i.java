class Solution {
    public int smallestNumber(int n, int t) {
        while(n>0){
            int temp =n;
            int product =1;
            while(temp>0){
                int quotient = temp/10;
                int remainder = temp%10;
                product = product*remainder;
                temp=quotient;
            }
            if(product%t==0){
                return n;
            }
            n=n+1;
        }
        return -1;
    }
}