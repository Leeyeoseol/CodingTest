import java.util.*;
class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        Arrays.sort(mats);
        
        for(int k=mats.length-1;k>=0;k--){
            int mat=mats[k];//mat 하나 빼오기
            //System.out.print(mat);
            for(int i=0;i<=park.length-mat;i++){//park - 1
                for(int j=0;j<=park[i].length-mat;j++){//park[i] - 1
                    boolean bool=true;
                    //System.out.print(" "+i+""+j);
                    for(int a=i;a<i+mat;a++){
                        for(int b=j;b<j+mat;b++){
                            if(!park[a][b].equals("-1")){
                                bool=false;
                                break;
                            }
                        }
                        if(!bool) break;
                    }   
                    if(bool){
                        answer=mat;
                        return answer;
                    }
                }
            }
        }
        return answer;
        
    }
}
//전체 탐색 하거나 / 모든 크기의 돗자리를 모든 위치에 넣어보기