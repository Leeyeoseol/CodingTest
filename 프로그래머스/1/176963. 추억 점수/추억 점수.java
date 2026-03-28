import java.util.HashMap;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<name.length;i++){
            for(int j=0;j<yearning.length;j++){
                map.put(name[i], yearning[i]);//name, yearning
            }
        }
        for(int i=0;i<photo.length;i++){
            int sum=0;
            for(int j=0;j<photo[i].length;j++){
                String p =photo[i][j];
                if(map.containsKey(p)){
                    sum+=map.get(p);
                }
            }
            answer[i]=sum;
        }        
        return answer;
    }
}