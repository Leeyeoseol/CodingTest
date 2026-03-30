import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;

        int []str1=new int[before.length()];
        int []str2=new int[after.length()];
        
        if(before.length()!=after.length()) return 0;
        for(int i=0;i<before.length();i++){
            str1[i]=before.charAt(i);
        }
        Arrays.sort(str1);//정렬
                
        for(int i=0;i<after.length();i++){
            str2[i]=after.charAt(i);
        }
        Arrays.sort(str2);//정렬
        
        boolean a=false;
        for(int i=0;i<before.length();i++){
            if(str1[i]==str2[i]){//true
                a=true;
            }else{
                a=false;
                break;
            }
        }
        
        if(a==true){
            return 1;
        }else{
            return 0;
        }
    }
}