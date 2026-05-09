import java.util.*;
class Solution {
    public int solution(String myString, String pat) {
        StringBuilder ch = new StringBuilder(); 
        for(char c:myString.toCharArray()){
            if(c=='A') {
                ch.append('B');
            }else{
                ch.append('A');
            }
        }
        return ch.toString().contains(pat) ? 1 : 0;
    }
}
