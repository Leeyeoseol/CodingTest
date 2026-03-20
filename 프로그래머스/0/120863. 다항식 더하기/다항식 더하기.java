class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int xSum = 0;
        int numSum = 0;
        
        String[] poly = polynomial.split(" \\+ ") ;
        for(int i=0;i<poly.length;i++){
            if(poly[i].contains("x")){//x포함이라면
                String num=poly[i].replace("x","");
                if(num.equals("")){
                    xSum+=1;
                }else{
                    xSum+=Integer.parseInt(num);
                }
            }else{
                numSum+=Integer.parseInt(poly[i]);
            }
        }
        if(xSum > 0){
            if(xSum == 1){
                answer += "x";
            } else {
                answer += xSum + "x";
            }
        }
        if(numSum > 0){
            if(xSum > 0){
                answer += " + ";
            }
            answer += numSum;
        }
        if(answer.equals("")){
            answer = "0";
        }
        return answer;
    }
}