class Solution {
    public String solution(String s) {
        String answer = "";
        String []arr=new String[s.length()];
        for(int i=0;i<arr.length;i++){
             arr[i]=s.charAt(i)+"";
        }
        if(s.length()%2==0){//짝수
            answer = arr[s.length()/2 - 1] + arr[s.length()/2];
        }else{
            answer = arr[s.length()/2];
        }
        return answer;
    }
}