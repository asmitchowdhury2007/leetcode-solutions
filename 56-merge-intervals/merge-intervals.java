class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(end1>=intervals[i][0]){
                start1 = start1;
                end1 = Math.max(end1,intervals[i][1]);
                continue;
            }
           
            result.add(Arrays.asList(start1,end1));
            start1 = intervals[i][0];
            end1 = intervals[i][1];
            
            
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