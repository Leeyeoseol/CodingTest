import java.util.*;
class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int num1= Integer.parseInt(bin1, 2); ;//1번째 수
        int num2= Integer.parseInt(bin2, 2);//2번째 수
        
        int sum=num1+num2;
        
        answer = Integer.toBinaryString(sum);
        return answer;
    }
}