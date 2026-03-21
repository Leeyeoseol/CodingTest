class Solution {
    public int solution(int chicken) {
        int answer = -1;
        int s=chicken / 10; 
        int num=0;
        
        while(s>=10){
            s++;
            s-=10;
            num++;
        }
        
        if(chicken%2==0){
            answer=(chicken / 10)+num;
        }else{
            answer=(chicken / 10)+num+1;
        }
        if(chicken==1)answer=0;
        if(chicken==9)answer=0;

        return answer;
    }
}