class Solution {
    public int solution(String[] strArr) {
        int[] answer = new int[31];
        for(String str:strArr){
            answer[str.length()]++;
        }
        //길이세고 
        int max=0;
        for(int ans:answer){
            if(ans>max){
                max=ans;
            }
        }
        return max;
    }
}