class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long imoney=0;
        for(int i=0;i<=count;i++){//놀이기구 타고싶은 수
            imoney+=price*i;
        }
        if(imoney>money){    
            answer=imoney-money;   
        }else{
            answer=0;
        }

        return answer;
    }
}