class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int m=0;
        
        for(int i=0; i < s.length(); i++){
            char ho = s.charAt(i);
            
            if(ho=='('){
                m++;
            }else{
                m--;
            }
            if(m<=-1){
                answer=false;
                break;
            }
            if(m==0){
            answer=true;
            }else{
            answer=false;

            }
        }
        char h=s.charAt(0);
        if(h==')') answer=false;
        return answer;
    }
}