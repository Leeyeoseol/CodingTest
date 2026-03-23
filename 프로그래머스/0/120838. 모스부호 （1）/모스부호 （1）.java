class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] let = {};
        let=letter.split(" ");//공백 기준으로 나누기
        String []check={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};//전체 모스부호
        for(int i=0;i<let.length;i++){
            for(int j=0;j<check.length;j++){
                if(let[i].equals(check[j])){
                    char ch = (char)(j + 'a');
                    answer += ch;
                    break;
                }
            }
        }
        return answer;
    }
}