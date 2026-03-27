import java.util.*;
public class Solution{
    public static long[] solution(long l,long r){
        List<Long> list=new ArrayList<>();
        for(long i=l;i<=r;i++){
            String s=String.valueOf(i);
            boolean valid=true;
            for(char c:s.toCharArray()){
                if(c!='0'&&c!='5'){valid=false;break;}
            }
            if(valid)list.add(i);
        }
        if(list.isEmpty())return new long[]{-1};
        long[] answer=new long[list.size()];
        for(int i=0;i<list.size();i++){answer[i]=list.get(i);}
        return answer;
    }
    public static void main(String[] args){
        System.out.println(Arrays.toString(solution(5,60)));
    }
}