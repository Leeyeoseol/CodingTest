class Solution {
    public String[] solution(String[] names) {
        int s=(names.length+4)/5;
        String[] answer = new String[s];
        int num=0;
        
        for(int i=0;i<names.length;i+=5){
            answer[num++]=names[i];
        }
        return answer;
    }
}