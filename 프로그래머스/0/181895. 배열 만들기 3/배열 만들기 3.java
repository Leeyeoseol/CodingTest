class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int a1=intervals[0][0],b1=intervals[0][1];
        int a2=intervals[1][0], b2=intervals[1][1];

        int[] answer = new int[(b1 - a1 + 1) + (b2 - a2 + 1)];

        int num=0;
        for(int i=a1;i<=b1;i++){
            answer[num]+=arr[i];
            num++;
        }
        for(int i=a2;i<=b2;i++){
            answer[num]+=arr[i];
            num++;
        }
        return answer;
    }
}