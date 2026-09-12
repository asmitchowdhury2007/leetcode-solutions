class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        int result = 0;
        for(int i=0;i<digits.length;i++){
            freq[digits[i]]++;
        }
        for(int u=0;u<=8;u=u+2){
            if(freq[u]==0){
                continue;
            }
            
            else{
                freq[u]--;
                for(int h=1;h<=9;h++){
                    if(freq[h]>0){
                        freq[h]--;
                        for(int t=0;t<=9;t++){
                            if(freq[t]>0){
                                freq[t]--;
                                result++;
                                freq[t]++;
                            }
                            
                        }
                        freq[h]++;
                    }
                    
                }
                freq[u]++;
            }
            
        }
        return result;
    }
}