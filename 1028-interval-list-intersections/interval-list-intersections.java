class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<List<Integer>> result = new ArrayList<>();
        int start = 0;
        int end = 0;
        int i=0;
        int j=0;
        while(i<firstList.length && j<secondList.length){
            int start1 = firstList[i][0];
            int end1 = firstList[i][1];
            int start2 = secondList[j][0];
            int end2 = secondList[j][1];
            if(start1<=start2){
                if(start2<=end1){
                    start = Math.max(start1,start2);
                    end = Math.min(end1,end2);
                    result.add(Arrays.asList(start,end));
                }
            }
            else{
                if(start1<=end2){
                    start = Math.max(start1,start2);
                    end = Math.min(end1,end2);
                    result.add(Arrays.asList(start,end));
                }
            }
            if(end1<=end2){
                i++;
            }
            else{
                j++;
            }
        }
        int[][] answer = new int[result.size()][2];
        for(i=0;i<result.size();i++){
            answer[i][0] = result.get(i).get(0);
            answer[i][1] = result.get(i).get(1);
        }
        return answer;
    }
}