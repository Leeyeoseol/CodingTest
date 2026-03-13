import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){//나누어 떨어질때
               a++; 
            }
        }
        if(a==0){
            a++;
        }
        int[] answer = new int[a];

        int check=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){//나누어 떨어질때
               answer[check]+=arr[i];
                check++;
            }
        }
    
        if(check==0){
            answer[0]+=-1;
        }
        
        Arrays.sort(answer);
        return answer;
    }
}