import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        Map<String, Integer> playerMap = new HashMap<>();
        for (int i= 0;i<players.length;i++){
            playerMap.put(players[i], i);
        }//하나씩 Map에 넣기
        
        for(int i=0;i<callings.length;i++){
            int rank= playerMap.get(callings[i]);//등수
            String name= answer[rank-1];//이름
            
            answer[rank-1]= answer[rank];//
            answer[rank]= name;
            playerMap.put(answer[rank-1],rank-1);
            playerMap.put(answer[rank],rank);
        }
        return answer;
    }
}
