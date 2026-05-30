import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();        
        for(int num:arr){
            if(!list.isEmpty()&&list.get(list.size()- 1)==num){
                list.remove(list.size()-1);
            }else{
                list.add(num);
            }
        }
        
        // 빈 배열 처리
        if (list.isEmpty()) {
            return new int[]{-1};
        }
        int[] answer=new int[list.size()];
        for(int i=0; i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}