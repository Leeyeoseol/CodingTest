class Solution {
    public int solution(int slice, int n) {
        int m=0;
        int answer=0;
        for (int i = 1; i <= 100; i++) { //1~100까지 돌림
            if ((n + slice - 1) / slice==i) {//n+slice-1/slice==i일때 
                answer= i;
                break;
            }
        }
        return answer;

    }
}