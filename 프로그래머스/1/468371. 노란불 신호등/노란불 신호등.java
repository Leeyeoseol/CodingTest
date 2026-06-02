import java.util.*;
class Solution {
    public int solution(int[][] signals) {
        int num= 3200000;//한계
        for(int t=1;t<=num;t++){
            boolean isAnswer=true; //노란색 true
            
            for(int i=0;i<signals.length;i++){
                int g=signals[i][0];
                int y=signals[i][1];
                int r=signals[i][2];
                int total= g+y+r;
                
                int rem= t%total;
                if(rem==0)rem=total;
                
                if(!(rem>g && rem<=(g+y))){
                    isAnswer=false; 
                    break;            
                }
            }
            if(isAnswer){
                return t;
            }
        }
        return -1; 
    }
}
//1초부터시작
//20까지가 전체주기합의 최대
