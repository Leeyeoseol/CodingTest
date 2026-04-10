class Solution {
    public int solution(String my_string) {
        // int pcnt=0;//피연산자
        // int cnt=0;
        String[] str = my_string.split(" "); //나눠서 넣기
        int answer=Integer.parseInt(str[0]);
  
        
        for(int i=1;i< str.length; i+=2){
            if(str[i].equals("+")){
                answer=answer+Integer.parseInt(str[i+1]);
            }else{
                answer= answer-Integer.parseInt(str[i+1]);
            }
        }    
        return answer;
    }
}
// int pcnt=0;//피연산자
// int cnt=0;
// for(int i=0;i<=str.length-1;i++){
//     if(str[i].equals("+")||str[i].equals("-")){//연산자라면
//         cnt++;
//     }else{//피연산자라면
//         pcnt++;
//     }
// }
//--- ^ my_string/2 에서 +1하면 피연산자 그냥하면 연산자 / 나중에 해보기
//         int num1=0,num2=0;
//         String []pop=new String[pcnt];
//         String []op=new String [cnt];
//         for(int i=0;i<=str.length-1;i++){
//            if(str[i].equals("+")||str[i].equals("-")){//연산자라면
//                op[num1++]=str[i];
//             }else{//피연산자라면
//                pop[num2++]=str[i];

//             }
//         }
        
//각각 나누기
//피연산자 연산자 수 세기
//피연산자 연산자 각각의 배열에 넣기
//answer에 미리 피연산자[0]을 넣어놓고
//if(연산자)비교하며 하기