import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        StringBuffer num=new StringBuffer();
        for(int i=0;i<my_string.length();i++){
            char ch = my_string.charAt(i); 
            if(Character.isDigit(ch)){
                num.append(ch);
            }else{
               if (num.length() > 0) {
                    answer += Integer.parseInt(num.toString());
                    num.setLength(0);
                }
            }
        }
        if(num.length()!=0){
            answer+=Integer.parseInt(num.toString());
        }
        return answer;
    }
}