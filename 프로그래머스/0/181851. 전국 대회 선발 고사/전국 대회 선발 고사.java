import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<attendance.length;i++){
            if(attendance[i]){
                list.add(rank[i]);
            }
        }
        Collections.sort(list);  
        
        int rankA=list.get(0);
        int rankB=list.get(1);
        int rankC=list.get(2);
        
        int a=0, b=0,c=0;
        for(int i=0;i<rank.length;i++){
            if(rank[i] ==rankA)a=i;
            if(rank[i] ==rankB) b=i;
            if(rank[i] ==rankC) c=i;
        }
        return 10000*a+100*b+c;
    }
}