class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int count = 0;
        boolean odd = false;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))>0 && map.get(s.charAt(i))%2==0){
                int even_pair = map.get(s.charAt(i))/2;
                count = count + even_pair*2;
                map.put(s.charAt(i),map.get(s.charAt(i))-even_pair*2);
            }
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))%2!=0){
                int even_pair = map.get(s.charAt(i))/2;
                count = count + even_pair*2;
                
                if(map.get(s.charAt(i))%2>0){
                    odd = true;
                }
                map.put(s.charAt(i),map.get(s.charAt(i))-even_pair*2);
                
            }
        }
        if(odd){
            count++;
        }
        return count;
    }
}