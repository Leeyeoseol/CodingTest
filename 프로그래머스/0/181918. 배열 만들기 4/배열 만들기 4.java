import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int n=arr.length;
        int[]stk=new int[n];
        int top=-1;           
        int i=0;
        
        while(i<n){
            if(top==-1 || stk[top]<arr[i]){
                stk[++top]=arr[i]; 
                i++;
            } else {
                top--;
            }
        }
        
        return Arrays.copyOf(stk, top+1);
    }
}