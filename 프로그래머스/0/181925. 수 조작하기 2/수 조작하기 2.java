class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i=1;i<numLog.length;i++){
            int dif =numLog[i]-numLog[i-1];
            
            if(dif<0){//음수
                int diff = -dif;//절댓값
                if(diff%10==0){
                    int a=diff/10;
                    while(a>0){
                        answer+="a";
                        a--;
                    }//for? while?
                }else{
                    while(diff>0){
                        answer+="s";
                        diff--;
                    };
                }
            }else if(dif>0){//양수
                if(dif%10==0){
                    int a=dif/10;
                    while(a>0){
                        answer+="d";
                        a--;
                    }
                }else{
                    while(dif>0){
                        answer+="w";
                        dif--;
                    }
                }
            }
        }
        return answer;
    }
}
