class Solution {
    public int solution(int[] num_list) {
        int answer = num_list[0];
        if(num_list.length>=11){
            for(int i=1;i<num_list.length;i++){
                answer+=num_list[i];
            }
        }else if(num_list.length<=10){
            for(int j=1;j<num_list.length;j++){
                answer*=num_list[j];
            }
        }
        return answer;
    }
}