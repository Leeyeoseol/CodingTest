import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer=new int[commands.length];
        
        for(int c=0;c<commands.length;c++){
            int i=commands[c][0];//시작 
            int j=commands[c][1];//끝
            int k=commands[c][2];//찾을거
            
            int length=j-i+1;
            int[] sliced= new int[length];
            
            int index= 0;
            for(int r=i-1;r <j;r++){
                sliced[index]=array[r];
                index++;
            }
            
            Arrays.sort(sliced);
            
            answer[c]=sliced[k - 1];
        }
        
        return answer;
    }
}
