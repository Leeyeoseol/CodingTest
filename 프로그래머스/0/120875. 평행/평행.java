class Solution {
    public int solution(int[][] dots) {
        int answer=0;
        double a=(double)(dots[1][1]-dots[0][1]) / (dots[1][0]-dots[0][0]);//1 0
        double b=(double)(dots[3][1]-dots[2][1]) / (dots[3][0]-dots[2][0]);//3 2
        if(a==b){
            answer= 1;
        }
        a=(double)(dots[3][1]-dots[1][1]) / (dots[3][0]-dots[1][0]);//3 1
        b=(double)(dots[2][1]-dots[0][1]) / (dots[2][0]-dots[0][0]);//2 0
        if(a==b){
            answer= 1;
        }
        a=(double)(dots[3][1]-dots[2][1]) / (dots[3][0]-dots[0][0]);//3 0
        b=(double)(dots[2][1]-dots[1][1]) / (dots[2][0]-dots[1][0]);//2 1
        if(a==b){
            answer= 1;
        }
        return answer;
    }
}
