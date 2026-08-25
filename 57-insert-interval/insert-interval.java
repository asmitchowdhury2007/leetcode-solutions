class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> merged = new ArrayList<>();
        boolean insert = false;
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]>=newInterval[0] && insert==false){
                merged.add(Arrays.asList(newInterval[0],newInterval[1]));
                insert = true;
            }
            merged.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            
        }
        if(merged.size()==0 || insert==false){
            merged.add(Arrays.asList(newInterval[0],newInterval[1]));
        }
        List<List<Integer>> result = new ArrayList<>();
        int start1 = merged.get(0).get(0);
        int end1 = merged.get(0).get(1);
        for(int i=1;i<merged.size();i++){
            int start2 = merged.get(i).get(0);
            int end2 = merged.get(i).get(1);
            if(end1>=start2){
                start1 = start1;
                end1 = Math.max(end1,end2);
                continue;
            }
            result.add(Arrays.asList(start1,end1));
            start1 = merged.get(i).get(0);
            end1 = merged.get(i).get(1);

        }
        
        result.add(Arrays.asList(start1,end1));
        
        int[][] answer = new int[result.size()][2];
        for(int i=0;i<result.size();i++){
            answer[i][0] = result.get(i).get(0);
            answer[i][1] = result.get(i).get(1);
        }
        return answer;
    }
}