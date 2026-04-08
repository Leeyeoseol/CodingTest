import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int check=1;
        int []num=new int[array.length];
        for(int i=0;i<array.length;i++){//array배열만큼
            num[i]=Math.abs(n-array[i]);//절대값 구해서 넣기 // 17, 10, 8
        }  
        Arrays.sort(num);//정렬
        
        for(int i = 0 ; i < num.length ; i++){
            if(array[i] == n-num[0]){//비교
                check--;//작아서
                break;
            }
        }
        if(check==0){
            answer=n-num[0];
        }else{
            answer=n+num[0];
        }
        
        return answer;
    }

}