class Solution {
    public String solution(String my_string, int s, int e) {
        String a = my_string.substring(0, s);
        String b = my_string.substring(s,e+1);//21Sremm
        String reb="";
        for(int i=b.length()-1;i>=0;i--){
            reb +=b.charAt(i);
        }
        
        String c = my_string.substring(e+1);
        String answer=(a+reb+c);
        return answer;
    }
}