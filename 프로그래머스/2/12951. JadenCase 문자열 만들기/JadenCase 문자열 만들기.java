import java.util.*; 
class Solution {
    public String solution(String s) {
        StringBuilder answer =new StringBuilder();
        boolean f=true;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            
            if(ch==' '){
                answer.append(ch);
                f=true; //첫 글자
            }else{
                if(f){
                    answer.append(Character.toUpperCase(ch));
                    f=false;
                }else{
                    answer.append(Character.toLowerCase(ch));
                }
            }
        }
        return answer.toString();
    }
}