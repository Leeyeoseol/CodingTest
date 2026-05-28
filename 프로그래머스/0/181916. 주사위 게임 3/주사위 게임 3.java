import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int []arr=new int[6];
        arr[a-1]++;
        arr[b-1]++;
        arr[c-1]++;
        arr[d-1]++;
        //System.out.print(arr[0]+", "+arr[1]+", "+arr[2]+", "+arr[3]+", "+arr[4]+", "+arr[5]);
        int arrcount=0;
        String arrstr="";
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=0){
                arrcount++;
                arrstr+=(arr[i]+"");
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arrstr.equals("4")){
                answer=1111*a;
            }else if(arrstr.equals("13")||arrstr.equals("31")){
                int p=0;
                int q=0;
                for(int j=0;j<arr.length;j++){
                    if(arr[j]==3)p=j+1;
                    if(arr[j]==1)q=j+1;
                }
                answer =(int)Math.pow(10*p+q,2);  
            }else if(arrstr.equals("22")){
                int p=0;
                int q=0;
                for(int j=0;j<arr.length;j++){
                    if(arr[j]==2){
                        if(p==0) p=j+1;
                        else q=j+1;
                    }
                }
                answer=(p+q) *Math.abs(p-q);
            }else if(arrcount==3){
                int q=0;
                int r=0;
                for(int j=0;j<arr.length;j++){
                    if(arr[j]==1){
                        if(q==0) q=j+1;
                        else r=j+1;
                    }
                }
                answer=q*r;
            }else{
                for(int j=0;j<arr.length;j++){
                    if(arr[j]==1){
                        answer=j+1;
                        break; 
                    }
                }
            }
        }
        return answer;
    }
}

//a b c d
//1~6 까지의 배열해서 a,b,c,d, 각각 위치에 넣고 ++1하기! (그러면 2개쌍 경우도 해결됨)
//4개 동일 : 0이 아닌 배열이 1개이며 / 그 값이 4일때
//3개 동일 : 0이 아닌 배열이 2개이며 / 값이 1, 3 일때 / (10 × p + q)2
//2개쌍 동일 : 0이 아닌 배열이 2개이며 / 값이 2, 2 일때
//2개 동일 : 0이 아닌 배열이 3개이며 / 값이 2, 1, 1일때
//다 다름 : 0이 아닌 배열이 4개이며 / 값이 1, 1, 1, 1일때
