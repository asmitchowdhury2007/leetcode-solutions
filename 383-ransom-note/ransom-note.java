class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            map1.put(magazine.charAt(i),map1.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            if(map1.containsKey(ransomNote.charAt(i))){
                map2.put(ransomNote.charAt(i),map2.getOrDefault(ransomNote.charAt(i),0)+1);
                map1.put(ransomNote.charAt(i),map1.get(ransomNote.charAt(i))-1);
                if(map1.get(ransomNote.charAt(i))==0){
                    map1.remove(ransomNote.charAt(i));
                }
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}