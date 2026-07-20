import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<report.length;i++){
            set.add(report[i]);
        }
        
        HashMap<String, Integer> map1=new HashMap<>();
        for (String r : set) {
            String[] s = r.split(" ");
            String name2 = s[1];  // 신고당한 사람
    
            map1.put(name2, map1.getOrDefault(name2, 0) + 1);
        }

        int[]answer=new int[id_list.length];
        HashMap<String, Integer> map2 = new HashMap<>();
        for(int i=0;i<id_list.length;i++){
             map2.put(id_list[i], i);
        }
        
        
        for(String r:set){
            String[]s=r.split(" ");
            String name1 =s[0];
            String name2=s[1];
            
            if(map1.getOrDefault(name2, 0) >= k){
                int index = map2.get(name1);
                answer[index]++;
            }
        }
        return answer;
    }
}