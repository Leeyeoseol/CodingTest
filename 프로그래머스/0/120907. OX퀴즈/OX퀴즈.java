class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i=0;i<quiz.length;i++){
           String[] str = quiz[i].split(" ");
           int ans=Integer.parseInt(str[0]);
            int result=0;
            for(int j=1;j< str.length; j+=2){
                if(str[j].equals("=")){
                    result = Integer.parseInt(str[j+1]);//정답 빼기
                    break;
                }else if(str[j].equals("+")){
                    ans = ans+Integer.parseInt(str[j+1]);
                }else{
                    ans = ans-Integer.parseInt(str[j+1]);
                }
            }    
            if(result==ans){
                answer[i]="O";
            }else{
                answer[i]="X";
            }
        }
        return answer;
    }
}

//배열마다 비교
//String[] str = quiz[i].split(" "); 으로 분리
// = 전까지만 =후는 정답으로 해서 분류 result
//ans==result면 O아니면 X