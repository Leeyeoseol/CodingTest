import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        

        int[] count = new int[26];
        
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }

        List<Character> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            if(count[s.charAt(i) - 'a'] == 1){
                list.add(s.charAt(i));
            }
        }

        Collections.sort(list);
        for(char c : list){
            answer += c;
        }

        return answer;
    }
}