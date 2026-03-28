import java.util.Arrays;
import java.util.HashMap;
class Solution {
    public int[] solution(int[] emergency) {
         int n=emergency.length;
        int[] answer=new int[n];
    
        int[] sorted=emergency.clone();//복사
        Arrays.sort(sorted);
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int rank = 1;
        
        for(int i=n-1; i>=0; i--){
            map.put(sorted[i],rank++);
        }

        for(int i=0; i<n; i++){
            answer[i]=map.get(emergency[i]);
        }
        
        return answer;
    }
}