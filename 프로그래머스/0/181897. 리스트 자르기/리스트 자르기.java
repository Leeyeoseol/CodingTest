import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        Stack<Integer> stack = new Stack<>(); 
        if(n==1){
            for(int i=0;i<slicer[1]+1;i++){
                stack.push(num_list[i]);
            }
        }else if(n==2){
            for(int i=slicer[0];i<num_list.length;i++){
                stack.push(num_list[i]);
            }
        }else if(n==3){
            for(int i=slicer[0];i<slicer[1]+1;i++){
                stack.push(num_list[i]);
            }
        }else if(n==4){
            for(int i=slicer[0];i<slicer[1]+1;i+=slicer[2]){                stack.push(num_list[i]);
            }
        }
        int[] result = new int[stack.size()];
        for(int i=0;i<stack.size();i++){
            result[i]=stack.get(i);
        }
        return result;
    }
}
